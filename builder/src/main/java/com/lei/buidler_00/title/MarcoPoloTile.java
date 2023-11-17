package com.lei.buidler_00.title;

import com.lei.buidler_00.Matter;

import java.math.BigDecimal;

/**
 * 马可波罗
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class MarcoPoloTile implements Matter {
    /**
     * @return
     */
    @Override
    public String scene() {
        return "地砖";
    }

    /**
     * @return
     */
    @Override
    public String brand() {
        return "马可波罗(MarcoPolo)";
    }

    /**
     * @return
     */
    @Override
    public String model() {
        return "缺省";
    }

    /**
     * @return
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    /**
     * @return
     */
    @Override
    public String desc() {
        return "马可波罗(MARCO POLO)集团是⼀家以研发、⽣产、销售⼀体的现代化建陶⽣产企业，⽬前拥有马可波罗、魔法师、迪奥⽊、马可波罗轻奢、汉斯·威尔斯、马可波罗⽼虎等多个品牌。";
    }
}
