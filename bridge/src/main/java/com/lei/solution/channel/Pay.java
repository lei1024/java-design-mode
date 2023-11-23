package com.lei.solution.channel;

import com.lei.solution.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 支付
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public abstract class Pay {
    protected Logger logger = LoggerFactory.getLogger(Pay.class);

    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 划账接口
     *
     * @param uid
     * @param tradeId
     * @param amount
     * @return
     */
    public abstract String transfer(String uid, String tradeId, BigDecimal amount);

}
