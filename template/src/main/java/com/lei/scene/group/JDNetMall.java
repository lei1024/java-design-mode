package com.lei.scene.group;

import com.lei.scene.NetMall;

import java.util.Map;

/**
 * 京东
 *
 * @author leijiahao
 * @date 2023-12-22
 */
public class JDNetMall extends NetMall {
    public JDNetMall(String uid, String pwd) {
        super(uid, pwd);
    }

    /**
     * @param reptile
     * @return
     */
    @Override
    protected String createBase64(Map<String, String> reptile) {
        logger.info("模拟生成京东商品二维码:{}", reptile.toString()
                                                        .hashCode());
        return null;
    }

    /**
     * @param skuUrl
     * @return
     */
    @Override
    protected Map<String, String> repTitle(String skuUrl) {
        logger.info("模拟京东爬取商品信息:{}", skuUrl);
        return null;
    }

    /**
     * @param uid
     * @param pwd
     * @return
     */
    @Override
    protected Boolean login(String uid, String pwd) {
        logger.info("模拟京东登录");
        return null;
    }
}
