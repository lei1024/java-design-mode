package com.lei.scene;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 组合控制器
 * 以营销决策树为例
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public class EngineController {
    private final Logger logger = LoggerFactory.getLogger(EngineController.class);

    public String process(final String userId, final String userSex, final int userAge) {
        logger.info("决策引擎开始处理:userId:{},userSex:{},userAge:{}", userId, userSex, userAge);
        logger.info("ifelse实现方式判断用户结果userId:{},userSex:{},userAge:{}", userId, userSex, userAge);
        if ("man".equals(userSex)) {
            if (userAge < 25) {
                return "优惠券A";
            } else if (userAge >= 35) {
                return "优惠券B";
            }
        }
        if ("woman".equals(userSex)) {
            if (userAge < 25) {
                return "优惠券C";
            } else if (userAge >= 35) {
                return "优惠券D";
            }
        }
        return "success";
    }

}
