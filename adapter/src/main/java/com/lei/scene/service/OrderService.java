package com.lei.scene.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 订单服务
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class OrderService {
    private final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public long queryUserOrderCount(String userId) {
        logger.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10L;
    }


}
