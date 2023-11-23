package com.lei.solution.channel;

import com.lei.solution.mode.IPayMode;

import java.math.BigDecimal;

/**
 * 支付宝支付
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class ZfbPay extends Pay {
    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uid, String tradeId, BigDecimal amount) {
        logger.info("模拟支付宝渠道支付划账开始.uid:{} tradeId:{} amount:{}", uid, tradeId, amount);
        boolean security = payMode.security(uid);
        logger.info("模拟支付宝渠道支付风控校验.uid:{} tradeId:{} amount:{}", uid, tradeId, security);
        if (!security) {
            logger.info("模拟支付宝渠道支付划账拦截.uid:{} tradeId:{} amount:{}", uid, tradeId, amount);
            return "0001";
        }
        logger.info("模拟支付宝渠道支付划账成功.uid:{} tradeId:{} amount:{}", uid, tradeId, amount);
        return "0000";
    }
}
