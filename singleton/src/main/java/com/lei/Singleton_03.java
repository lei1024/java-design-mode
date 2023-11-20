package com.lei;

/**
 * 懒汉式单例（线程安全）
 * 锁加在方法上,效率低
 *
 * @author leijiahao
 * @date 2023-11-20
 */
public class Singleton_03 {
    private static Singleton_03 instance;

    private Singleton_03() {
    }

    public static synchronized Singleton_03 getInstance() {
        if (null != instance) return instance;
        instance = new Singleton_03();
        return instance;
    }
}
