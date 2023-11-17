package com.lei.buidler_00.floor;

import com.lei.buidler_00.Matter;

import java.math.BigDecimal;

/**
 * 德尔地板
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class DerFloor implements Matter {


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
        return "德尔(Der)";
    }

    /**
     * @return
     */
    @Override
    public String model() {
        return "A+";
    }

    /**
     * @return
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    /**
     * @return
     */
    @Override
    public String desc() {
        return "DER德尔集团是全球领先的专业⽊地板制造商，北京2008年奥运会家装和公装地板供应商";
    }
}
