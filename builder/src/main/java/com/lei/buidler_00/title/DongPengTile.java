package com.lei.buidler_00.title;

import com.lei.buidler_00.Matter;

import java.math.BigDecimal;

/**
 * 东鹏地砖
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class DongPengTile implements Matter {

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
        return "东鹏(DongPeng)";
    }

    /**
     * @return
     */
    @Override
    public String model() {
        return "10001";
    }

    /**
     * @return
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(102);
    }

    /**
     * @return
     */
    @Override
    public String desc() {
        return "东鹏瓷砖创建于1972年，总部位于广东省东莞市，是⼀家集研发、⽣产、销售、服务于⼀体的⼤型建陶企业，旗下拥有东鹏、马可波罗、东鹏⽼虎等品牌。";
    }
}
