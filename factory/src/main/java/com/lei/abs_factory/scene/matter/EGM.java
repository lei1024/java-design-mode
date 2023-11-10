package com.lei.abs_factory.scene.matter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * 模拟Redis集群EGM,方法不同
 *
 * @author leijiahao
 * @date 2023-11-10
 */
public class EGM {
    private Logger logger = LoggerFactory.getLogger(EGM.class);
    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String gain(String key) {
        logger.info("EGM获取数据 key:{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        logger.info("EGM写入数据 key:{},value:{}", key, value);
        dataMap.put(key, value);
    }

    public void setEx(String key, String value, long timeout, TimeUnit timeUnit) {
        logger.info("EGM写入数据 key:{},value:{},timeout:{},timeUnit:{}", key, value, timeout, timeUnit);
        dataMap.put(key, value);
    }

    public void delete(String key) {
        logger.info("EGM删除数据 key:{}", key);
        dataMap.remove(key);
    }

}
