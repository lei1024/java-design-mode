package com.lei.buidler_00.floor;

import com.lei.buidler_00.Matter;

import java.math.BigDecimal;

/**
 * 圣象地板
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class ShengXiangFloor implements Matter {

    /**
     * @return
     */
    @Override
    public String scene() {
        return "地板";
    }

    /**
     * @return
     */
    @Override
    public String brand() {
        return "圣象(ShengXiang)";
    }

    /**
     * @return
     */
    @Override
    public String model() {
        return "一级";
    }

    /**
     * @return
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(318);
    }

    /**
     * @return
     */
    @Override
    public String desc() {
        return "圣象地板是中国地板⾏业著名品牌。圣象地板拥有中国驰名商标、中国名牌、国家免检、中国环境标志认证等多项荣誉。";
    }
}
