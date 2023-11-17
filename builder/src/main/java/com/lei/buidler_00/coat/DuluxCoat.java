package com.lei.buidler_00.coat;

import com.lei.buidler_00.Matter;

import java.math.BigDecimal;

/**
 * 多乐士涂料
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class DuluxCoat implements Matter {


    /**
     * @return
     */
    @Override
    public String scene() {
        return "涂料";
    }

    /**
     * @return
     */
    @Override
    public String brand() {
        return "多乐士(Dulux)";
    }

    /**
     * @return
     */
    @Override
    public String model() {
        return "第⼆代";
    }

    /**
     * @return
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    /**
     * @return
     */
    @Override
    public String desc() {
        return "多乐⼠是阿克苏诺⻉尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年全球有5000万户家庭使⽤多乐⼠油漆。";
    }
}
