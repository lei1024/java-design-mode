package com.lei.solution.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 密码支付
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class PayCypher implements IPayMode {
    private final Logger logger = LoggerFactory.getLogger(PayCypher.class);

    /**
     * @param uid
     * @return
     */
    @Override
    public boolean security(String uid) {
        logger.info("密码支付,风控校验密码");
        return true;
    }
}
