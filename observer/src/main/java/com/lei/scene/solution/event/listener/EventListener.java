package com.lei.scene.solution.event.listener;

import com.lei.scene.solution.LotteryResult;

/**
 * 事件监听器
 * 接口中定义了基本的事件类型,入参可以考虑使用泛型
 *
 * @author leijiahao
 * @date 2023-12-19
 */
public interface EventListener {
    void doEvent(LotteryResult result);
}
