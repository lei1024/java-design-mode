package com.lei.scene.factory.impl;

import com.lei.scene.factory.CouponService;
import com.lei.scene.factory.ICommodity;

import java.util.Map;

/**
 * @author leijiahao
 * @date 2023-11-10
 */
public class CouponCommodityService implements ICommodity {

    private CouponService couponService = new CouponService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, Object> extMap) throws Exception {

    }

    private String qryUserName(String uId) {
        return "花花";
    }

    private String qryUserPhoneName(String uId) {
        return "1231231231";
    }
}
