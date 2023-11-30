package com.lei.sulotion.cook.impl;

import com.lei.sulotion.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author leijiahao
 * @date 2023-11-30
 */
public class GuangDongCook implements ICook {
    private final Logger logger = LoggerFactory.getLogger(GuangDongCook.class);

    /**
     *
     */
    @Override
    public void doCooking() {
        logger.info("广东厨师做广东菜");
    }
}
