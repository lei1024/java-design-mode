package com.lei.solution;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 活动工厂/享元工厂
 *
 * @author leijiahao
 * @date 2023-11-29
 */
public class ActivityFactory {

    static Map<Long, Activity> activityMap = new HashMap<>();

    public static Activity getActivity(Long id) {
        Activity activity = activityMap.get(id);
        if (null == activity) {
            // 模拟实际从业务中获取活动信息
            activity = new Activity();
            activity.setId(100001L);
            activity.setName("图书嗨乐");
            activity.setDesc("图书优惠券分享激励分享活动第⼆期");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id, activity);
        }
        return activity;
    }
}
