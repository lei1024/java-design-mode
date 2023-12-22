package com.lei.solution.event;

import com.lei.solution.ICouponDiscount;

import java.math.BigDecimal;

/**
 * 直减
 *
 * @author leijiahao
 * @date 2023-12-22
 */
public class ZJDiscount implements ICouponDiscount<Double> {
    /**
     * @param couponInfo 折扣信息
     * @param skuPrice   价格
     * @return
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (discount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        return discount;
    }
}
