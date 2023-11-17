package com.lei.builder_02;

import com.lei.buidler_00.Matter;

/**
 * 方案
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public interface IMenu {
    /**
     * 吊顶
     * @param matter
     * @return
     */
    IMenu appendCeiling(Matter matter);

    /**
     * 涂料
     * @param matter
     * @return
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     * @param matter
     * @return
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     * @param matter
     * @return
     */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     * @return
     */
    String getDetail();
}
