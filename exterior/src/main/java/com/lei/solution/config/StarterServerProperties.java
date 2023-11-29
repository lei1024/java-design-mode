package com.lei.solution.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author leijiahao
 * @date 2023-11-29
 */
@ConfigurationProperties("itstack.door")
public class StarterServerProperties {
    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }

}
