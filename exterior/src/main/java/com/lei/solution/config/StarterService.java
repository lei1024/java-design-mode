package com.lei.solution.config;

import org.springframework.util.StringUtils;

/**
 * 服务
 *
 * @author leijiahao
 * @date 2023-11-29
 */
public class StarterService {
    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separator) {
        return StringUtils.split(this.userStr, separator);
    }
}
