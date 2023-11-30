package com.lei.scene.test;

import com.alibaba.fastjson2.JSON;
import com.lei.scene.AuthController;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.Date;

/**
 * test
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public class ApiTest {
    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_authController() throws ParseException {
        AuthController authController = new AuthController();
        // 模拟三级负责人审批
        logger.info("测试结果:{}", JSON.toJSONString(authController.doAuth("100001", "10001083", new Date())));
        logger.info("测试结果:{}", "模拟三级负责人审批");
        // 模拟二级负责人审批
        // 模拟一级负责人审批
    }
}
