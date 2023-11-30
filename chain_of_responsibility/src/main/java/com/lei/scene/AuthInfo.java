package com.lei.scene;

/**
 * @author leijiahao
 * @date 2023-11-30
 */
public class AuthInfo {
    private String number;
    private String type;
    private String orderId;
    private String info;
    private String name;

    public AuthInfo(String number, String type, String orderId, String info, String name) {
        this.number = number;
        this.type = type;
        this.orderId = orderId;
        this.info = info;
        this.name = name;
    }
}
