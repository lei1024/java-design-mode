package com.lei.abs_factory.good.test;

import com.lei.abs_factory.bad.service.CacheService;
import com.lei.abs_factory.good.JDKProxyFactory;
import com.lei.abs_factory.good.factory.EGMCacheAdapter;
import com.lei.abs_factory.good.factory.IIRCacheAdapter;
import org.junit.jupiter.api.Test;

/**
 * 测试
 *
 * @author leijiahao
 * @date 2023-11-14
 */
public class ApiTest {
    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxyFactory.getProxy(CacheService.class, EGMCacheAdapter.class);
        proxy_EGM.set("lei", "haha");
        String s = proxy_EGM.get("lei");
        System.out.println(s);
        CacheService proxy_iir = JDKProxyFactory.getProxy(CacheService.class, IIRCacheAdapter.class);
        proxy_iir.set("lei","hahaha");
        String s1 = proxy_iir.get("lei");
        System.out.println(s1);


    }
}
