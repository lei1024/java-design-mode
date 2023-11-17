package com.lei.abs_factory.bad.service.impl;

import com.lei.abs_factory.bad.scene.RedisUtils;
import com.lei.abs_factory.bad.service.CacheService;

import java.util.concurrent.TimeUnit;

/**
 * @author leijiahao
 * @date 2023-11-10
 */
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    /**
     * @param key
     * @return
     */
    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    /**
     * @param key
     * @param val
     */
    @Override
    public void set(String key, String val) {
        redisUtils.set(key, val);
    }

    /**
     * @param key
     * @param val
     * @param timeout
     * @param timeUnit
     */
    @Override
    public void set(String key, String val, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, val, timeout, timeUnit);
    }

    /**
     * @param key
     */
    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
