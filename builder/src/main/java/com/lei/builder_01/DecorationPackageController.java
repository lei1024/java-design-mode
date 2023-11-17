package com.lei.builder_01;

import com.lei.buidler_00.Matter;
import com.lei.buidler_00.ceilling.LevelOneCeiling;
import com.lei.buidler_00.ceilling.LevelTwoCeilling;
import com.lei.buidler_00.coat.DuluxCoat;
import com.lei.buidler_00.coat.LiBangCoat;
import com.lei.buidler_00.floor.ShengXiangFloor;
import com.lei.buidler_00.title.DongPengTile;
import com.lei.buidler_00.title.MarcoPoloTile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 装修控制类
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class DecorationPackageController {
    public String getMatterList(BigDecimal area, Integer level) {
        List<Matter> list = new ArrayList<Matter>();
        BigDecimal price = BigDecimal.ZERO;
        // 豪华欧式
        if (1 == level) {
            // 吊顶，⼆级顶
            LevelTwoCeilling levelTwoCeilling = new LevelTwoCeilling();
            DuluxCoat duluxCoat = new DuluxCoat();
            ShengXiangFloor shengXiangFloor = new ShengXiangFloor();
            list.add(levelTwoCeilling);
            // 涂料，多乐⼠
            list.add(duluxCoat);
            // 地板，德尔(Der)
            list.add(shengXiangFloor);
            price = price.add(area.multiply(new BigDecimal("0.2"))
                                  .multiply(levelTwoCeilling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4"))
                                  .multiply(duluxCoat.price()));
            price = price.add(area.multiply(shengXiangFloor.price()));
        }
        // 轻奢⽥园
        if (2 == level) {
            // 吊顶，⼆级顶
            LevelTwoCeilling levelTwoCeilling = new LevelTwoCeilling();
            LiBangCoat liBangCoat = new LiBangCoat();
            MarcoPoloTile marcoPoloTile = new MarcoPoloTile();
            list.add(levelTwoCeilling);
            // 涂料，多乐⼠
            list.add(liBangCoat);
            // 地板，德尔(Der)
            list.add(marcoPoloTile);
            price = price.add(area.multiply(new BigDecimal("0.2"))
                                  .multiply(levelTwoCeilling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4"))
                                  .multiply(liBangCoat.price()));
            price = price.add(area.multiply(marcoPoloTile.price()));
        }
        // 现代简约
        if (3 == level) {
            // 吊顶，⼆级顶
            LevelOneCeiling levelOneCeiling = new LevelOneCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            DongPengTile dongPengTile = new DongPengTile();
            list.add(levelOneCeiling);
            // 涂料，多乐⼠
            list.add(liBangCoat);
            // 地板，德尔(Der)
            list.add(dongPengTile);
            price = price.add(area.multiply(new BigDecimal("0.2"))
                                  .multiply(levelOneCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4"))
                                  .multiply(liBangCoat.price()));
            price = price.add(area.multiply(dongPengTile.price()));
        }

        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + level + "\r\n" +
                "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + " 元\r\n" +
                "房屋⾯积：" + area.doubleValue() + " 平⽶\r\n" +
                "材料清单：\r\n");
        for (Matter matter : list) {
            detail.append(matter.scene())
                  .append("：")
                  .append(matter.brand())
                  .append("、")
                  .append(matter.model())
                  .append("、平⽶价格：")
                  .append(matter.price())
                  .append(" 元。\n");
        }
        return detail.toString();
    }
}
