package com.lei.abs_factory.good.factory;

import com.lei.abs_factory.bad.scene.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author leijiahao
 * @date 2023-11-14
 */
public class IIRCacheAdapter implements ICacheAdapter {
    //定义为private，防止被外部调用,IIR的工具类
    private IIR iir = new IIR();
    /**
     * @param key
     * @return
     */
    @Override
    public String get(String key) {
        return iir.get(key);
    }

    /**
     * @param key
     * @param val
     */
    @Override
    public void set(String key, String val) {
        iir.set(key,val);
    }

    /**
     * @param key
     * @param val
     * @param timeout
     * @param timeUnit
     */
    @Override
    public void set(String key, String val, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key,val,timeout,timeUnit);
    }

    /**
     * @param key
     */
    @Override
    public void del(String key) {
        iir.del(key);
    }
}
