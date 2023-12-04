package com.lei.solution.group;

/**
 * Employee
 *
 * @author leijiahao
 * @date 2023-12-04
 */
public class Employee {

    private String uId;
    private String name;
    private String describe;

    public Employee(String uid, String name, String describe) {
        this.uId = uid;
        this.name = name;
        this.describe = describe;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
