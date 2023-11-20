package com.lei;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS（线程安全）
 *
 * @author leijiahao
 * @date 2023-11-20
 */
public class Singleton_07 {
    private static final AtomicReference<Singleton_07> INSTANCE = new AtomicReference<>();
    private static Singleton_07 instance;

    private Singleton_07() {
    }

    public static Singleton_07 getInstance() {
        //for循环的无限循环写法
        for (; ; ) {
            Singleton_07 singleton07 = INSTANCE.get();
            if (null != singleton07) {
                return singleton07;
            }
            INSTANCE.compareAndSet(null, new Singleton_07());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_07.getInstance());
        Singleton_08.INSTANCE.test();
    }


}
