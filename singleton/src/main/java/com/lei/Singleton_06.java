package com.lei;

/**
 * 双重锁校验(线程安全）
 *
 * @author leijiahao
 * @date 2023-11-20
 */
public class Singleton_06 {

    private static Singleton_06 instance;

    private Singleton_06() {
    }

    ;

    public static Singleton_06 getInstance() {
        // 双重锁校验是对方法锁的优化,减少了部分获取实例的耗时
        // 满足了懒加载
        if (null != instance) return instance;
        synchronized (Singleton_06.class) {
            instance = new Singleton_06();
        }
        return instance;
    }
}
