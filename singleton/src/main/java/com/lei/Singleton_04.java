package com.lei;

/**
 * 饿汉式单例
 *
 * @author leijiahao
 * @date 2023-11-20
 */
public class Singleton_04 {
    public static Singleton_04 instance = new Singleton_04();

    private Singleton_04() {
    }

    public static Singleton_04 getInstance() {
        return instance;
    }
}
