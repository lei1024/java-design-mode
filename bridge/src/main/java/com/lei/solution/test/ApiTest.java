package com.lei.solution.test;

import com.lei.solution.channel.Pay;
import com.lei.solution.channel.WxPay;
import com.lei.solution.channel.ZfbPay;
import com.lei.solution.mode.PayFaceMode;
import com.lei.solution.mode.PayFingerprintMode;
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
        System.out.println("模拟支付场景:微信支付,人脸方式");
        Pay pay = new WxPay(new PayFaceMode());
        pay.transfer("weixin_213123", "100021312", new BigDecimal(100));

        System.out.println("模拟支付场景:支付宝支付,指纹方式");

        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jiu1231231", "100021312", new BigDecimal(100));
    }
}
