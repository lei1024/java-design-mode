package com.lei.scene.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户信息
 *
 * @author leijiahao
 * @date 2023-11-27
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInfo {
    private String code;
    private String info;
    private String name;
    private Integer age;
    private String address;

    public UserInfo(String info, int age, String address) {
        this.info = info;
        this.age = age;
        this.address = address;
    }

    public UserInfo(String code, String info) {
        this.code = code;
        this.info = info;
    }
}
