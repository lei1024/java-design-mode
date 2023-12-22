package com.lei.scene;


/**
 * 优惠券满减
 * 1.直减券
 * 2.满减券
 * 3.折扣券
 * 4.n元购
 *
 * @author leijiahao
 * @date 2023-12-22
 */
public class CouponDiscountService {
    public double discountAmount(int type, double typeCount, double skuPrice, double typeExt) {
        if (1 == type) {
            return skuPrice - typeCount;
        } else if (2 == type) {
            if (skuPrice < typeExt) {
                return skuPrice;
            }
            return skuPrice - typeCount;
        } else if (3 == type) {
            return skuPrice * typeCount;
        } else if (4 == type) {
            return typeCount;
        } else {
            return 0D;
        }
    }
}
