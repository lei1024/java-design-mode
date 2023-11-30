package com.lei.sulotion.cook.impl;

import com.lei.sulotion.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author leijiahao
 * @date 2023-11-30
 */
public class SiChuanCook implements ICook {
    private final Logger logger = LoggerFactory.getLogger(SiChuanCook.class);

    /**
     *
     */
    @Override
    public void doCooking() {
        logger.info("四川厨师做四川菜");
    }
}
