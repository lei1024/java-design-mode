package com.lei.prototye_00;

/**
 * 问答题
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class AnswerQuestion {
    private String name;
    private String key;

    public AnswerQuestion(){};
    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }


    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
