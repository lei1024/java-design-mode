package com.lei.solution_adapter;

import com.alibaba.fastjson2.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * MQ消息处理适配器
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class MqAdapter {

    public static RebateInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            String value = link.get(key);
            Object val = obj.get(value);
            RebateInfo.class.getMethod("set" + key.substring(0, 1)
                                                  .toUpperCase() + key.substring(1), val.getClass())
                            .invoke(rebateInfo, val);
        }
        return rebateInfo;
    }
}
