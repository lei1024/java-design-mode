package com.lei.abs_factory.good;

import com.lei.abs_factory.good.factory.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理处理类-工厂实现
 *
 * @author leijiahao
 * @date 2023-11-14
 */

public class JDKInvocationHandler implements InvocationHandler {
    private ICacheAdapter cacheAdapter;
    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 通过反射调用目标方法
        return ICacheAdapter.class.getMethod(method.getName(), method.getParameterTypes())
                                    .invoke(cacheAdapter, args);
    }
}
