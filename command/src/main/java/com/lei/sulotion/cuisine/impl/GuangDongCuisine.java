package com.lei.sulotion.cuisine.impl;

import com.lei.sulotion.cook.ICook;
import com.lei.sulotion.cuisine.ICuisine;

/**
 * @author leijiahao
 * @date 2023-11-30
 */
public class GuangDongCuisine implements ICuisine {
    private ICook cook;

    public GuangDongCuisine(ICook cook) {
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
