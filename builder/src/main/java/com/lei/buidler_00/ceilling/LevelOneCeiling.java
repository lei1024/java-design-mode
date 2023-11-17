package com.lei.buidler_00.ceilling;

import com.lei.buidler_00.Matter;

import java.math.BigDecimal;

/**
 * 吊顶一级
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class LevelOneCeiling implements Matter {

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
        return "⼀级吊顶";
    }

    /**
     * @return
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    /**
     * @return
     */
    @Override
    public String desc() {
        return "造型只做低一级,只有一个层次的吊顶,一般离顶120-150mm";
    }
}
