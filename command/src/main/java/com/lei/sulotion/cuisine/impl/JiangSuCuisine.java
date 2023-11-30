package com.lei.sulotion.cuisine.impl;

import com.lei.sulotion.cook.ICook;
import com.lei.sulotion.cuisine.ICuisine;

/**
 * 注释
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public class JiangSuCuisine implements ICuisine {
    private ICook cook;

    public JiangSuCuisine(ICook cook) {
        this.cook = cook;
    }

    /**
     *
     */
    @Override
    public void cook() {
        cook.doCooking();
    }
}
