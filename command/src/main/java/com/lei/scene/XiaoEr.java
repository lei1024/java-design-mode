package com.lei.scene;

import com.alibaba.fastjson2.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 小二
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public class XiaoEr {
    private final Logger logger = LoggerFactory.getLogger(XiaoEr.class);
    private Map<Integer, String> cuisineMap = new ConcurrentHashMap<>();

    /**
     * 下单
     *
     * @param cuisine
     */
    public void order(int cuisine) {
        if (1 == cuisine) {
            cuisineMap.put(1, "粤菜");
        } else if (2 == cuisine) {
            cuisineMap.put(2, "苏菜");
        } else if (3 == cuisine) {
            cuisineMap.put(3, "鲁菜");
        } else if (4 == cuisine) {
            cuisineMap.put(4, "川菜");
        }
    }

    /**
     * 展示菜单
     */
    public void placeOrder() {
        logger.info("菜单:{}", JSON.toJSONString(cuisineMap));
    }
}
