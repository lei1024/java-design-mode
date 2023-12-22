package com.lei.solution;

import java.math.BigDecimal;

/**
 * 优惠券接口
 *
 * @author leijiahao
 * @date 2023-12-22
 */
public interface ICouponDiscount<T> {
    /**
     * 优惠券计算
     *
     * @param couponInfo 折扣信息
     * @param skuPrice   价格
     * @return 优惠后金额
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
