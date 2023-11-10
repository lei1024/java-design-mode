package com.lei.scene.factory;

import java.util.Map;

/**
 * 统一接口
 *
 * @author leijiahao
 * @date 2023-11-10
 */
public interface ICommodity {
    /**
     * 发送抽奖请求
     * @param uId
     * @param commodityId
     * @param bizId
     * @param extMap
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String,Object> extMap) throws Exception;
}
