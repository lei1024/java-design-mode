package com.lei.solution.orm.mediator;


/**
 * Sql 会话
 *
 * @author leijiahao
 * @date 2023-12-06
 */
public interface SqlSession {
    <T> T selectOne(String statement);

    void close();
}
