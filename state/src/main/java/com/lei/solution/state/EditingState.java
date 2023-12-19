package com.lei.solution.state;

import com.lei.scene.ActivityService;
import com.lei.scene.Status;
import com.lei.solution.Result;
import com.lei.solution.State;

/**
 * @author leijiahao
 * @date 2023-12-19
 */
public class EditingState extends State {
    /**
     * @param activityId    活动id
     * @param currentStatus 当前状态
     * @return
     */
    @Override
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.check);
        return new Result("0000", "活动提审成功");
    }

    /**
     * @param activityId    活动id
     * @param currentStatus
     * @return
     */
    @Override
    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "编辑中活动不可审核通过");
    }

    /**
     * @param activityId    活动ID
     * @param currentStatus
     * @return
     */
    @Override
    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "编辑中活动不可审核拒绝");
    }

    /**
     * @param activityId
     * @param currentStatus
     * @return
     */
    @Override
    public Result checkResolve(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "编辑中活动不可审核撤销");
    }

    /**
     * @param activityId
     * @param currentStatus
     * @return
     */
    @Override
    public Result close(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.close);
        return new Result("0001", "活动关闭成功");
    }

    /**
     * @param activityId
     * @param currentStatus
     * @return
     */
    @Override
    public Result open(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "编辑中活动不可开启");
    }

    /**
     * @param activityId
     * @param currentStatus
     * @return
     */
    @Override
    public Result doing(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "编辑中活动不可执行");
    }
}
