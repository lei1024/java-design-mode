package com.lei.normal.test;

import com.alibaba.fastjson2.JSON;
import com.lei.normal.ActivityExecStatusController;
import com.lei.normal.Result;
import com.lei.scene.ActivityService;
import com.lei.scene.Status;
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
    public void test_status() {
        //初始化数据
        String activityId = "10001";
        ActivityService.init(activityId, Status.editing);
        ActivityExecStatusController controller = new ActivityExecStatusController();
        Result result = controller.changeStatus(activityId, Status.editing, Status.refuse);
        logger.info("测试结果:{}", JSON.toJSONString(result));
        controller.changeStatus(activityId, Status.editing, Status.check);
        logger.info("测试结果:{}", JSON.toJSONString(result));
    }
}
