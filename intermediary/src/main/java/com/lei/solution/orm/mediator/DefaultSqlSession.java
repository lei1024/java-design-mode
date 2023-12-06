package com.lei.solution.orm.mediator;


import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 默认实现
 *
 * @author leijiahao
 * @date 2023-12-06
 */
public class DefaultSqlSession implements SqlSession {
    private Connection connection;
    private Map<String, XNode> mappingElement;

    public DefaultSqlSession(Connection con, Map<String, XNode> map) {
        this.connection = con;
        this.mappingElement = map;
    }

    /**
     * @param statement
     * @param <T>
     * @return
     */
    @Override
    public <T> T selectOne(String statement) {
        try {
            XNode xNode = mappingElement.get(statement);
            PreparedStatement preparedStatement = connection.prepareStatement(xNode.getSql());
            ResultSet resultSet = preparedStatement.executeQuery();
            List<T> objects = resultSet2Obj(resultSet, Class.forName(xNode.getResultType()));
            return objects.get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private <T> List<T> resultSet2Obj(ResultSet resultSet, Class<?> aClass) {
        List<T> list = new ArrayList<>();
        try {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                T tObj = (T) aClass.newInstance();
                for (int i = 1; i <= columnCount; i++) {
                    Object val = resultSet.getObject(i);
                    String columnName = metaData.getColumnName(i);
                    String setMethodName = "set" + columnName.substring(0, 1)
                                                             .toUpperCase()
                            + columnName.substring(1);
                    Method method;
                    if (val instanceof Timestamp) {
                        method = aClass.getMethod(setMethodName, Date.class);
                    } else {
                        method = aClass.getMethod(setMethodName, val.getClass());
                    }
                    method.invoke(tObj, val);
                }
                list.add(tObj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     *
     */
    @Override
    public void close() {
        if (null == connection) {
            return;
        }
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
