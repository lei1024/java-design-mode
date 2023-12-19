package com.lei.solution.test;

import com.lei.scene.ActivityService;
import com.lei.scene.Status;
import com.lei.solution.Result;
import com.lei.solution.StateHandler;
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
    public void test_state() {
        String activityId = "123123";
        ActivityService.init(activityId, Status.editing);
        StateHandler handler = new StateHandler();
        // 每种状态都有对提审的处理,但是只有编辑中状态才能提审,其他均不能提审,这样就避免了if else
        Result result = handler.arriagnment(activityId, Status.editing);
    }
}
