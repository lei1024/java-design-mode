package com.lei.solution;

import java.math.BigDecimal;

/**
 * 折扣策略
 *
 * @author leijiahao
 * @date 2023-12-22
 */
public class DisCountStrategy<T> {
    private ICouponDiscount<T> couponDiscount;

    public DisCountStrategy(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }

}
