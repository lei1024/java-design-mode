package com.lei.scene.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * POP订单服务
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class POPOrderService {
    private final Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    public boolean isFirstOrder(String userId) {
        logger.info("POP商家，查询用户的订单是否为首单：{}", userId);
        return true;
    }

}
