package com.lei.scene;

/**
 * 状态
 *
 * @author leijiahao
 * @date 2023-12-19
 */
public enum Status {
    // 1创建编辑、2待审核、3审核通过(任务扫描成活动中)、4审核拒绝(可以撤审到编辑状态)、5活动中、6活动关闭、7活动开启(任务扫描成活动中)
    editing, check, pass, refuse, doing, close, open
}
