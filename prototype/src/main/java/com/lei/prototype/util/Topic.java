package com.lei.prototype.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 主题
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class Topic {
    private HashMap<String, String> option;
    private String key;
    public Topic(HashMap<String, String> optionNew, String keyNew) {
        this.option = optionNew;
        this.key = keyNew;
    }

    public String getKey() {
        return key;
    }

    public Map<String, String> getOption() {
        return option;
    }
}
