package com.lei.buidler_00.ceilling;

import com.lei.buidler_00.Matter;

import java.math.BigDecimal;

/**
 * 吊顶二级
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class LevelTwoCeilling implements Matter {

    /**
     * @return
     */
    @Override
    public String scene() {
        return "吊顶";
    }

    /**
     * @return
     */
    @Override
    public String brand() {
        return "装修公司⾃带";
    }

    /**
     * @return
     */
    @Override
    public String model() {
        return "⼆级吊顶";
    }

    /**
     * @return
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(480);
    }

    /**
     * @return
     */
    @Override
    public String desc() {
        return "两个层级的吊顶,离顶⾼度⼀般为200mm";
    }
}
