package com.lei.scene.solution;

import com.lei.scene.solution.event.EventManager;
import com.lei.scene.solution.event.listener.MQEventListener;
import com.lei.scene.solution.event.listener.MessageEventListener;

/**
 * service
 * 业务抽象接口
 *
 * @author leijiahao
 * @date 2023-12-19
 */
public abstract class LotteryService {
    private EventManager eventManager;

    public LotteryService() {
        eventManager = new EventManager(EventManager.MEventType.MQ, EventManager.MEventType.MESSAGE);
        eventManager.subscribe(EventManager.MEventType.MQ, new MQEventListener());
        eventManager.subscribe(EventManager.MEventType.MESSAGE, new MessageEventListener());
    }

    public LotteryResult draw(String uId) {
        LotteryResult lotteryResult = doDraw(uId);
        //需要什么通知就调用什么方法
        eventManager.notify(EventManager.MEventType.MQ, lotteryResult);
        eventManager.notify(EventManager.MEventType.MESSAGE, lotteryResult);
        return lotteryResult;
    }

    protected abstract LotteryResult doDraw(String uId);
}
