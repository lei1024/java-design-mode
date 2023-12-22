package com.lei.user.impl;

import com.lei.user.User;
import com.lei.visitor.Visitor;

import java.math.BigDecimal;

/**
 * @author leijiahao
 * @date 2023-12-22
 */
public class MTeacher extends User {
    public MTeacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    /**
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitTeacher(this);
    }

    public double entranceRatio() {
        return BigDecimal.valueOf(Math.random() * 100)
                         .setScale(2, BigDecimal.ROUND_HALF_UP)
                         .doubleValue();
    }
}
