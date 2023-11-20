package com.lei;


/**
 * 懒汉式单例(线程不安全)
 * <p>
 * 特点是不允许外部创建实例
 *
 * @author leijiahao
 * @date 2023-11-20
 */

public class Singleton_02 {
    private static Singleton_02 instance = null;

    private Singleton_02() {
    }

    public static Singleton_02 getInstance() {
        if (instance == null) {
            instance = new Singleton_02();
        }
        return instance;
    }
}
