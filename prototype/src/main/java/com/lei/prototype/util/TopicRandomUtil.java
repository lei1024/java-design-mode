package com.lei.prototype.util;

import java.util.*;

/**
 * 主题随机工具类
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class TopicRandomUtil {
    /**
     * 乱序map元素,记录对应答案key
     * @param option 题目
     * @param key 答案
     * @return 乱序后 {A=c,B=d,C=a,D=b}
     */
    public static Topic randomTopic(Map<String,String > option, String key) {
        Set<String> keySet = option.keySet();
        List<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList);
        HashMap<String,String > optionNew = new HashMap<>();
        int idx = 0;
        String keyNew = "";
        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if (key.equals(next)) {
                keyNew = randomKey;
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }
}
