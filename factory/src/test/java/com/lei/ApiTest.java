package com.lei;


import com.lei.scene.factory.ICommodity;
import com.lei.scene.factory.StoreFactory;
import org.junit.Test;

/**
 * @author leijiahao
 * @date 2023-11-10
 */

public class ApiTest {
    @Test
    public void test_commodity() throws Exception {
        StoreFactory storeFactory = new StoreFactory();
        //1.优惠券
        ICommodity commodityService1 = storeFactory.getCommodityService(1);
        commodityService1.sendCommodity("","","",null);
        //2.实物商品
        ICommodity commodityService2 = storeFactory.getCommodityService(2);
        commodityService2.sendCommodity("","","",null);
        //3.爱奇艺
        ICommodity commodityService3 = storeFactory.getCommodityService(3);
        commodityService3.sendCommodity("","","",null);

    }
}
