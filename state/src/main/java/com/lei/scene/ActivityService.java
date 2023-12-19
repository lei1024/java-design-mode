package com.lei.scene;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务
 *
 * @author leijiahao
 * @date 2023-12-19
 */
public class ActivityService {
    public static final Logger logger = LoggerFactory.getLogger(ActivityService.class);
    private static Map<String, Enum<Status>> statusMap = new ConcurrentHashMap<>();

    public static void init(String activityId, Enum<Status> status) {
        //模拟查询活动信息
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.setActivityId(activityId);
        activityInfo.setActivityName("早起学习打卡领奖活动");
        activityInfo.setBeginTime(new Date());
        activityInfo.setStatus(status);
        activityInfo.setEndTime(new Date());
        statusMap.put(activityId, status);
    }

    /**
     * 查询活动信息
     */
    public static ActivityInfo qryActivityInfo(String activityId) {
        //模拟查询活动信息
        ActivityInfo activityInfo = new ActivityInfo();
        activityInfo.setActivityId(activityId);
        activityInfo.setActivityName("早起学习打卡领奖活动");
        activityInfo.setStatus(statusMap.get(activityId));
        activityInfo.setBeginTime(new Date());
        activityInfo.setEndTime(new Date());
        return activityInfo;
    }

    public static Enum<Status> qryActivityStatus(String activityId) {
        return statusMap.get(activityId);
    }

    /**
     * 执行状态变更
     */
    public static synchronized void execStatus(String activityId, Enum<Status> beforeStatus, Enum<Status> afterStatus) {
        if (!beforeStatus.equals(statusMap.get(activityId))) {
            logger.info("状态不匹配，不执行");
            return;
        }
        statusMap.put(activityId, afterStatus);
        logger.info("状态变更成功");
    }
}
