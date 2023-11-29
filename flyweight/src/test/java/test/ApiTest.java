package test;

import com.alibaba.fastjson2.JSON;
import com.lei.solution.Activity;
import com.lei.solution.ActivityController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * test
 *
 * @author leijiahao
 * @date 2023-11-29
 */
public class ApiTest {
    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    private ActivityController activityController = new ActivityController();

    @Test
    public void test_queryActivityInfo() throws InterruptedException {
        for (int idx = 0; idx < 10; idx++) {
            Long req = 10001L;
            Activity activity = activityController.queryActivityInfo(req);
            logger.info("测试结果：{} {}", req,
                    JSON.toJSONString(activity));
            Thread.sleep(1200);
        }
    }
}
