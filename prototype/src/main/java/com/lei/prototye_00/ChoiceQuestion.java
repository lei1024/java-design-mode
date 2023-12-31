package com.lei.prototye_00;

import java.util.Map;

/**
 * 选择题
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class ChoiceQuestion {

    private String name;
    private Map<String, String> option;

    private String key;

    public ChoiceQuestion(){};

    public ChoiceQuestion(String name, Map<String, String> option, String key) {
        this.name = name;
        this.option = option;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getOption() {
        return option;
    }

    public void setOption(Map<String, String> option) {
        this.option = option;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
