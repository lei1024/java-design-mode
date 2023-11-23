package com.lei.scene.mq;

import java.util.Date;

/**
 * 注册开户MQ
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class CreateAccount {
    private String number; //开户编号
    private String address; // 开户地
    private String desc; // 开户时间
    private Date accountDate; // 开户描述

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }
}
