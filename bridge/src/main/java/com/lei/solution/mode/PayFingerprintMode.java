package com.lei.solution.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 指纹支付方式
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class PayFingerprintMode implements IPayMode {
    private final Logger logger = LoggerFactory.getLogger(PayFingerprintMode.class);

    /**
     * @param uid
     * @return
     */
    @Override
    public boolean security(String uid) {
        logger.info("指纹支付,风控校验指纹识别");
        return true;
    }
}
