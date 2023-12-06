package com.lei.solution.orm.mediator;

/**
 * 工厂类
 *
 * @author leijiahao
 * @date 2023-12-06
 */
public interface SqlSessionFactory {
    SqlSession openSqlSession();
}
