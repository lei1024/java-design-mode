package com.lei.solution.event;

import com.lei.solution.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 满减优惠
 *
 * @author leijiahao
 * @date 2023-12-22
 */
public class MJDiscount implements ICouponDiscount<Map<String, String>> {
    /**
     * @param couponInfo 折扣信息
     * @param skuPrice   价格
     * @return
     */
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {
        String x = couponInfo.get("x");
        String n = couponInfo.get("n");
        //小于商品金额直接返回
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) {
            return skuPrice;
        }
        // 减去优惠金额判断
        BigDecimal discount = skuPrice.subtract(new BigDecimal(n));
        if (discount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        } else {
            return discount;
        }
    }
}
