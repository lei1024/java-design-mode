package com.lei.solution.orm.mediator;

/**
 * 默认工厂
 *
 * @author leijiahao
 * @date 2023-12-06
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * @return
     */
    @Override
    public SqlSession openSqlSession() {
        return new DefaultSqlSession(configuration.connection, configuration.mapperElement);
    }
}
