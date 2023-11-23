package com.lei.solution_adapter;

/**
 * 统一的MQ消息题
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class RebateInfo {

    private String userId; // 用户ID
    private String bizId; // 业务ID
    private String bizTime; // 业务时间
    private String desc; // 业务描述

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getBizTime() {
        return bizTime;
    }

    public void setBizTime(String bizTime) {
        this.bizTime = bizTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
