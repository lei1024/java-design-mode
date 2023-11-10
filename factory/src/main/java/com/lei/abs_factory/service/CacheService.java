package com.lei.abs_factory.service;

import java.util.concurrent.TimeUnit;

/**
 * 缓存服务
 *
 * @author leijiahao
 * @date 2023-11-10
 */
public interface CacheService {
    String get(final String key);
    void set(String key,String val);
    void set(String key, String val, long timeout, TimeUnit timeUnit);
    void del(String key);
}
