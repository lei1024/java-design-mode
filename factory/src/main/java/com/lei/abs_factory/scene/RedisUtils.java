package com.lei.abs_factory.scene;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * redis工具类
 * @author leijiahao
 * @date 2023-11-10
 */
public class RedisUtils {
    private Logger logger = LoggerFactory.getLogger(RedisUtils.class);
    private Map<String ,String > dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        logger.info("Redis获取数据Key:{}",key);
        return dataMap.get(key);
    }

    public void set(String key,String value) {
        logger.info("Redis写入数据 key:{},value:{}",key,value);
        dataMap.put(key,value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
       logger.info("Redis写入数据 key:{},value:{},timeout:{},timeUnit:{}",key,value,timeout,timeUnit);
       dataMap.put(key,value);
    }
    public void del(String key) {
        logger.info("Redis删除数据 key:{}",key);
        dataMap.remove(key);
    }
}
