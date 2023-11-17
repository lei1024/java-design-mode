package com.lei.buidler_00;

import java.math.BigDecimal;

/**
 * 物料接口
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public interface Matter {
    String scene(); // 场景

    String brand(); // 品牌

    String model(); // 型号

    BigDecimal price(); // 价格

    String desc(); // 描述
}
