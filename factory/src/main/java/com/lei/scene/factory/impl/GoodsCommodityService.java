package com.lei.scene.factory.impl;

import com.lei.scene.factory.GoodsService;
import com.lei.scene.factory.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author leijiahao
 * @date 2023-11-10
 */
@Slf4j
public class GoodsCommodityService implements ICommodity {

    private GoodsService goodsService = new GoodsService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, Object> extMap) throws Exception {
        goodsService.send(uId,commodityId,bizId);
    }
}
