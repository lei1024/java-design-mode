package com.lei.solution.event;

import com.lei.solution.ICouponDiscount;

import java.math.BigDecimal;

/**
 * N元购
 *
 * @author leijiahao
 * @date 2023-12-22
 */
public class NYDiscount implements ICouponDiscount<Double> {
    /**
     * @param couponInfo 折扣信息
     * @param skuPrice   价格
     * @return
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
