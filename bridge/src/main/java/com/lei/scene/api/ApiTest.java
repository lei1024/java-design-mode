package com.lei.scene.api;

import com.lei.scene.PayController;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * 测试
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class ApiTest {

    @Test
    public void test_pay() {
        PayController pay = new PayController();
        System.out.println("模拟支付场景:微信支付,人脸方式");
        pay.doPay("weixin_213123", "100021312", new BigDecimal(100), 1, 2);
        System.out.println("模拟支付场景:支付宝支付,指纹方式");
        pay.doPay("jiu1231231", "100021312", new BigDecimal(100), 2, 3);
    }
}
