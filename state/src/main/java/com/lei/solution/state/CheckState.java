package com.lei.solution.state;

import com.lei.scene.ActivityService;
import com.lei.scene.Status;
import com.lei.solution.Result;
import com.lei.solution.State;

/**
 * @author leijiahao
 * @date 2023-12-19
 */
public class CheckState extends State {
    @Override
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "非审核状态不能重复提审");
    }

    @Override
    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.pass);
        return new Result("0000", "审核通过成功");
    }

    @Override
    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.refuse);
        return new Result("0001", "活动审核拒绝完成");
    }

    @Override
    public Result checkResolve(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.editing);
        return new Result("0001", "活动审核撤销完成,回到编辑中状态");
    }


    @Override
    public Result close(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.close);
        return new Result("0001", "活动审核关闭完成");
    }

    @Override
    public Result open(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "非关闭活动不可开启");
    }

    /**
     * @param activityId
     * @param currentStatus
     * @return
     */
    @Override
    public Result doing(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "非审核活动不可执行活动中变更");
    }
}
