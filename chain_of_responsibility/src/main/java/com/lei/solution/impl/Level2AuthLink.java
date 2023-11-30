package com.lei.solution.impl;

import com.lei.solution.AuthInfo;
import com.lei.solution.AuthLink;

import java.util.Date;

/**
 * @author leijiahao
 * @date 2023-11-30
 */
public class Level2AuthLink extends AuthLink {
    public Level2AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    /**
     * @param uId
     * @param orderId
     * @param authDate
     * @return
     */
    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        logger.info("二级审核开始");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("二级审核完成");
        if (next() != null) {
            return next().doAuth(uId, orderId, authDate);
        } else {
            logger.info("流程结束");
            return new AuthInfo(uId, orderId, "审核完成");
        }
    }
}
