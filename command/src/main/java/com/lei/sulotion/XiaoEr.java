package com.lei.sulotion;

import com.lei.sulotion.cuisine.ICuisine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者店小二
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public class XiaoEr {
    private final Logger logger = LoggerFactory.getLogger(XiaoEr.class);

    private List<ICuisine> cuisineList = new ArrayList<>();

    public void order(ICuisine cuisine) {
        cuisineList.add(cuisine);
    }

    public synchronized void placeOrder() {
        cuisineList.forEach(ICuisine::cook);
        cuisineList.clear();
    }

}
