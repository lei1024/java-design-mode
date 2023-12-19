package com.lei.normal;

import com.lei.scene.ActivityService;
import com.lei.scene.Status;

/**
 * controller
 *
 * @author leijiahao
 * @date 2023-12-19
 */
public class ActivityExecStatusController {
    /**
     * 活动状态变更
     * 1.编辑中-> 提审/关闭
     * 2.审核通过-> 活动中/关闭/拒绝
     * 3.审核拒绝-> 撤审,关闭
     * 4.活动中-> 关闭
     * 5.活动关闭->开启
     * 6.活动开启->关闭
     */
    public Result changeStatus(String activityId, Enum<Status> beforeStatus, Enum<Status> afterStatus) {
        //1.编辑中-> 提审/关闭
        if (Status.editing.equals(beforeStatus)) {
            if (Status.check.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000", "变更状态成功");
            } else {
                return new Result("0001", "变更拒绝");
            }
        }
        //2.审核通过 ->拒绝/关闭/活动中
        if (Status.pass.equals(beforeStatus)) {
            if (Status.refuse.equals(afterStatus)
                    || Status.doing.equals(afterStatus)
                    || Status.close.equals(afterStatus)
            ) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000", "变更状态成功");
            } else {
                return new Result("0001", "变更拒绝");
            }
        }
        //3.审核拒绝 -> 撤审,关闭
        if (Status.refuse.equals(beforeStatus)) {
            if (Status.editing.equals(afterStatus)
                    || Status.close.equals(afterStatus)
            ) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000", "变更状态成功");
            } else {
                return new Result("0001", "变更拒绝");
            }
        }
        //4.活动中->关闭
        if (Status.doing.equals(beforeStatus)) {
            if (Status.close.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000", "变更状态成功");
            } else {
                return new Result("0001", "变更拒绝");
            }
        }
        //5.活动关闭->开启
        if (Status.close.equals(beforeStatus)) {
            if (Status.open.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000", "变更状态成功");
            } else {
                return new Result("0001", "变更拒绝");
            }
        }
        //6.活动开启->关闭
        if (Status.open.equals(beforeStatus)) {
            if (Status.close.equals(afterStatus)) {
                ActivityService.execStatus(activityId, beforeStatus, afterStatus);
                return new Result("0000", "变更状态成功");
            } else {
                return new Result("0001", "变更拒绝");
            }
        }
        return new Result("0xxx", "非可处理的活动状态变更");
    }
}
