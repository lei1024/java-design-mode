package com.lei.solution.channel;

import com.lei.solution.mode.IPayMode;

import java.math.BigDecimal;

/**
 * 微信支付
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class WxPay extends Pay {
    public WxPay(IPayMode payMode) {
        super(payMode);
    }

    /**
     * @param uid
     * @param tradeId
     * @param amount
     * @return
     */
    @Override
    public String transfer(String uid, String tradeId, BigDecimal amount) {
        logger.info("模拟微信渠道支付划账开始.uid:{} tradeId:{} amount:{}", uid, tradeId, amount);
        boolean security = payMode.security(uid);
        logger.info("模拟微信渠道支付风控校验.uid:{} tradeId:{} amount:{}", uid, tradeId, security);
        if (!security) {
            logger.info("模拟微信渠道支付划账拦截.uid:{} tradeId:{} amount:{}", uid, tradeId, amount);
            return "0001";
        }
        logger.info("模拟微信渠道支付划账成功.uid:{} tradeId:{} amount:{}", uid, tradeId, amount);
        return "0000";
    }
}
