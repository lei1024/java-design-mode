package com.lei.scene.solution.test;

import com.alibaba.fastjson2.JSON;
import com.lei.scene.solution.LotteryResult;
import com.lei.scene.solution.LotteryService;
import com.lei.scene.solution.LotteryServiceImpl;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * test
 *
 * @author leijiahao
 * @date 2023-12-19
 */
public class ApiTest {

    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("123123123123");
        logger.info("测试结果:{}", JSON.toJSONString(result));
    }
}
