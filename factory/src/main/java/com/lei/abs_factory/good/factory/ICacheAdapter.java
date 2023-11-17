package com.lei.abs_factory.good.factory;

import java.util.concurrent.TimeUnit;

/**
 * 适配接口
 * 目的是让所有集群的提供方都能在统一的名称下进行操作,方便后续的扩展
 * @author leijiahao
 * @date 2023-11-14
 */
public interface ICacheAdapter {
    String get(String key);
    void set(String key,String val);
    void set(String key, String val, long timeout, TimeUnit timeUnit);
    void del(String key);
}
