package com.lei.scene.agent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Mapper工厂
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private final Logger logger = LoggerFactory.getLogger(MapperFactoryBean.class);

    private Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    /**
     * @return
     * @throws Exception
     */
    @Override
    public T getObject() throws Exception {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Select select = method.getAnnotation(Select.class);
                logger.info("SQL：{}", select.value()
                                            .replace("#{uId}", args[0].toString()));
                return args[0] + "被代理了";
            }
        };
        return (T) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{mapperInterface}, handler);
    }

    /**
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

    /**
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}

