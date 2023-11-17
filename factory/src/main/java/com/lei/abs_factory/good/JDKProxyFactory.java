package com.lei.abs_factory.good;

import com.lei.abs_factory.good.factory.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理类-抽象工厂
 *
 * @author leijiahao
 * @date 2023-11-14
 */
public class JDKProxyFactory {
    public static <T> T getProxy(Class<T> cacheClazz, Class<? extends ICacheAdapter> cacheAdapter) throws InstantiationException, IllegalAccessException {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter.newInstance());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{cacheClazz}, handler);
    }
}
