package com.lei;

/**
 * 使用类的内部类（线程安全）
 * 推荐
 *
 * @author leijiahao
 * @date 2023-11-20
 */
public class Singleton_05 {
    private Singleton_05() {
    }

    public static Singleton_05 getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static Singleton_05 instance = new Singleton_05();
    }

}
