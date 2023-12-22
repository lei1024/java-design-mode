package com.lei.user.impl;

import com.lei.user.User;
import com.lei.visitor.Visitor;

/**
 * @author leijiahao
 * @date 2023-12-22
 */
public class Student extends User {
    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    /**
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitStudent(this);
    }

    public int ranking() {
        return (int) (Math.random() * 100);
    }

}
