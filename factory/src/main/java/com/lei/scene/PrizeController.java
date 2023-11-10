package com.lei.scene;

import com.alibaba.fastjson2.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author leijiahao
 * @date 2023-11-10
 */

public class PrizeController {
    private final Logger logger = LoggerFactory.getLogger(PrizeController.class);

    /**
     * if else 频繁
     * @param req
     * @return
     */
    public AwardRes awardToUser(AwardReq req) {
        String reqJson = JSON.toJSONString(req);
        try {
            logger.info("奖品发放开始{}.req:{}",req.getUid(),reqJson);
            //按照不同类型方法商品[1:优惠券,2:实物商品,3:第三方兑换卡(爱奇艺)]
            if (req.getAwardType() == 1) {
               logger.info("发放奖品--优惠券");
            } else if (req.getAwardType() == 2) {
                logger.info("发放奖品--实物商品");
            } else if (req.getAwardType() == 3) {
                logger.info("发放奖品--爱奇艺");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return new AwardRes();
    }


}

