package com.lei.builder_02;

import com.lei.buidler_00.Matter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 装修方案
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class DecorationPackageMenu implements IMenu{
    private List<Matter> list = new ArrayList<>();
    private BigDecimal price = BigDecimal.ZERO;
    private BigDecimal area;
    private String grade;

    //构造器私有
    private DecorationPackageMenu() {
    }

    public DecorationPackageMenu(Double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }
    /**
     * @param matter
     * @return
     */
    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    /**
     * @param matter
     * @return
     */
    @Override
    public IMenu appendCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("1.4")).multiply(matter.price()));
        return this;
    }

    /**
     * @param matter
     * @return
     */
    @Override
    public IMenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    /**
     * @param matter
     * @return
     */
    @Override
    public IMenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    /**
     * @return
     */
    @Override
    public String getDetail() {
        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + grade + "\r\n" +
                "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + " 元\r\n" +
                "房屋⾯积：" + area.doubleValue() + " 平⽶\r\n" +
                "材料明细：" + "\r\n");
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
