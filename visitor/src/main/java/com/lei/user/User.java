package com.lei.user;

import com.lei.visitor.Visitor;

/**
 * @author leijiahao
 * @date 2023-12-22
 */
public abstract class User {
    public String name; //姓名
    public String identity; //身份
    public String clazz; //班级

    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    //核心访问方法
    public abstract void accept(Visitor visitor);

}
