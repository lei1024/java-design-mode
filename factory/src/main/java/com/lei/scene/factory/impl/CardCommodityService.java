package com.lei.scene.factory.impl;

import com.lei.scene.factory.ICommodity;
import com.lei.scene.factory.IQiYiCardService;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author leijiahao
 * @date 2023-11-10
 */
@Slf4j
public class CardCommodityService implements ICommodity {

    private IQiYiCardService iQiYiCardService = new IQiYiCardService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, Object> extMap) throws Exception {
        log.info("发送爱奇艺奖品");
    }
}
