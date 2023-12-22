package com.lei.solution.event;

import com.lei.solution.ICouponDiscount;

import java.math.BigDecimal;

/**
 * 折扣
 *
 * @author leijiahao
 * @date 2023-12-22
 */
public class ZKDiscount implements ICouponDiscount<Double> {
    /**
     * 折扣计算,打折
     *
     * @param couponInfo 折扣信息
     * @param skuPrice   价格
     * @return
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discount = skuPrice.multiply(new BigDecimal(couponInfo))
                                      .setScale(2, BigDecimal.ROUND_HALF_UP);
        if (discount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        } else {
            return discount;
        }
    }
}
