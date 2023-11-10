package com.lei.scene.factory;

import com.lei.scene.factory.entity.CouponResult;
import lombok.extern.slf4j.Slf4j;

/**
 * @author leijiahao
 * @date 2023-11-10
 */
@Slf4j
public class CouponService {

    private CouponResult send(String uid, String commodityId, String bizid) {
        log.info("发送优惠券请求");
        return new CouponResult();
    }
}
