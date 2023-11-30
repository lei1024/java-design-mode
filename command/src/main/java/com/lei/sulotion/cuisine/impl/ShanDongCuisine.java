package com.lei.sulotion.cuisine.impl;

import com.lei.sulotion.cook.ICook;
import com.lei.sulotion.cuisine.ICuisine;

/**
 * 山东菜
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public class ShanDongCuisine implements ICuisine {
    private ICook cook;

    public ShanDongCuisine(ICook cook) {
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
