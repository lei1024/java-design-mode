package com.lei.abs_factory.good.factory;

import com.lei.abs_factory.bad.scene.matter.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @author leijiahao
 * @date 2023-11-14
 */
public class EGMCacheAdapter implements ICacheAdapter {
    //定义为private，防止被外部调用,EGM的工具类
    private EGM egm = new EGM();
    /**
     * @param key
     * @return
     */
    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    /**
     * @param key
     * @param val
     */
    @Override
    public void set(String key, String val) {
        egm.set(key,val);
    }

    /**
     * @param key
     * @param val
     * @param timeout
     * @param timeUnit
     */
    @Override
    public void set(String key, String val, long timeout, TimeUnit timeUnit) {
        egm.setEx(key,val,timeout,timeUnit);
    }

    /**
     * @param key
     */
    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
