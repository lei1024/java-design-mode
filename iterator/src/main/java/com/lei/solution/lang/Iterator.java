package com.lei.solution.lang;

/**
 * 迭代器定义
 *
 * @author leijiahao
 * @date 2023-12-04
 */
public interface Iterator<E> {

    boolean hashNext();

    E next();

}
