package com.lei.scene;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 商城定义
 * 基础电商推广服务
 *
 * @author leijiahao
 * @date 2023-12-22
 */
public abstract class NetMall {
    protected final Logger logger = LoggerFactory.getLogger(NetMall.class);

    String uid;
    String pwd;

    public NetMall(String uid, String pwd) {
        this.uid = uid;
        this.pwd = pwd;
    }

    public String generateGoodsPoster(String skuUrl) {
        if (!login(uid, pwd)) {
            return null;
        }
        Map<String, String> reptile = repTitle(skuUrl);
        return createBase64(reptile);
    }

    /**
     * 模拟生成商品二维码
     *
     * @param reptile
     * @return
     */
    protected abstract String createBase64(Map<String, String> reptile);

    /**
     * 模拟爬取商品信息
     *
     * @param skuUrl
     * @return
     */
    protected abstract Map<String, String> repTitle(String skuUrl);

    /**
     * 模拟登录
     *
     * @param uid
     * @param pwd
     * @return
     */
    protected abstract Boolean login(String uid, String pwd);

}
