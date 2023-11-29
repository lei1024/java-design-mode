package com.lei.solution;

import com.lei.solution.util.RedisUtils;

/**
 * 活动控制类
 *
 * @author leijiahao
 * @date 2023-11-29
 */
public class ActivityController {
    private RedisUtils redisUtils = new RedisUtils();

    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        Stock stock = new Stock(1000, redisUtils.getStocked());
        activity.setStock(stock);
        return activity;
    }
}
