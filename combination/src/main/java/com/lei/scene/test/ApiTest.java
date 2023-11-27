package com.lei.scene.test;

import com.lei.scene.EngineController;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * test
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public class ApiTest {

    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_EngineController() {
        EngineController engineController = new EngineController();
        String process = engineController.process("okdjsfdf", "man", 40);
        logger.info("测试结果:{}", process);
    }

}
