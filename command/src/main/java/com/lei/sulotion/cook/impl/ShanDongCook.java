package com.lei.sulotion.cook.impl;

import com.lei.sulotion.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 山东cook
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public class ShanDongCook implements ICook {
    private final Logger logger = LoggerFactory.getLogger(ShanDongCook.class);

    /**
     *
     */
    @Override
    public void doCooking() {
        logger.info("山东厨师做山东菜");
    }
}
