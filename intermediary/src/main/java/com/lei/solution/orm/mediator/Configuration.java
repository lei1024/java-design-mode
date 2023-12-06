package com.lei.solution.orm.mediator;

import java.sql.Connection;
import java.util.Map;

/**
 * 配置类
 *
 * @author leijiahao
 * @date 2023-12-06
 */
public class Configuration {

    protected Connection connection;
    protected Map<String, String> dataSource;
    protected Map<String, XNode> mapperElement;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setDataSource(Map<String, String> dataSource) {
        this.dataSource = dataSource;
    }

    public void setMapperElement(Map<String, XNode> mapperElement) {
        this.mapperElement = mapperElement;
    }

}
