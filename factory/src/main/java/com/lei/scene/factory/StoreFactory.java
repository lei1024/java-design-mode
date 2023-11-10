package com.lei.scene.factory;


import com.lei.scene.factory.impl.CardCommodityService;
import com.lei.scene.factory.impl.CouponCommodityService;
import com.lei.scene.factory.impl.GoodsCommodityService;

/**
 * 商店工厂
 * @author leijiahao
 * @date 2023-11-10
 */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }
        if (1 == commodityType) {
            return new CouponCommodityService();
        }
        if (2 == commodityType) {
            return new GoodsCommodityService();
        }
        if (3 == commodityType) {
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品类型");
    }
}
