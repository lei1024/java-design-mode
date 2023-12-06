package com.lei.scene.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * @author leijiahao
 * @date 2023-12-06
 */
public class JDBCUtils {
    public static final Logger logger = LoggerFactory.getLogger(JDBCUtils.class);
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/itstackdemo-design";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        //3.操作数据库
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select *from user");
        while (resultSet.next()) {
            logger.info(resultSet.getString("123"));
        }
    }
}
