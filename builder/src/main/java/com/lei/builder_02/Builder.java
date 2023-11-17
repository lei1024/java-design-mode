package com.lei.builder_02;


import com.lei.buidler_00.ceilling.LevelOneCeiling;
import com.lei.buidler_00.ceilling.LevelTwoCeilling;
import com.lei.buidler_00.coat.DuluxCoat;
import com.lei.buidler_00.coat.LiBangCoat;
import com.lei.buidler_00.floor.ShengXiangFloor;
import com.lei.buidler_00.title.DongPengTile;
import com.lei.buidler_00.title.MarcoPoloTile;

/**
 * 建造者模式重构
 * @author leijiahao
 * @date 2023-11-17
 */
public class Builder {
    public IMenu levelOne (Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeilling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new ShengXiangFloor());
    }

    public IMenu levelTwo (Double area) {
        return new DecorationPackageMenu(area, "轻奢⽥园")
                .appendCeiling(new LevelTwoCeilling())
                .appendCoat(new LiBangCoat())
                .appendFloor(new MarcoPoloTile());
    }
    public IMenu levelThree (Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())
                .appendCoat(new LiBangCoat())
                .appendFloor(new DongPengTile());
    }

}

