package com.lei.solution.lang;

/**
 * 收集
 *
 * @author leijiahao
 * @date 2023-12-04
 */
public interface Collection<E, L> extends Iterable<E> {
    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);

    Iterator<E> iterator();
}
