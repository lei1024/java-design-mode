package com.lei.solution.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 人脸支付
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class PayFaceMode implements IPayMode {
    private final Logger logger = LoggerFactory.getLogger(PayFaceMode.class);

    /**
     * @param uid
     * @return
     */
    @Override
    public boolean security(String uid) {
        logger.info("人脸支付,风控校验脸部识别");
        return true;
    }
}
