package com.lei.scene.solution.event;

import com.lei.scene.solution.LotteryResult;
import com.lei.scene.solution.event.listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事件管理
 *
 * @author leijiahao
 * @date 2023-12-19
 */
public class EventManager {
    Map<Enum<MEventType>, List<EventListener>> listeners = new HashMap<>();

    public EventManager(Enum<MEventType>... operations) {
        for (Enum<MEventType> operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    /**
     * 订阅
     *
     * @param eventType 事件类型
     * @param listener  该类型使用的监听器
     */
    public void subscribe(Enum<MEventType> eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    /**
     * 取消订阅
     *
     * @param eventType
     * @param listener
     */
    public void unsubscribe(Enum<MEventType> eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(Enum<MEventType> mEventTypeEnum, LotteryResult result) {
        List<EventListener> eventListeners = listeners.get(mEventTypeEnum);
        for (EventListener eventListener : eventListeners) {
            eventListener.doEvent(result);
        }
    }

    public enum MEventType {
        MQ, MESSAGE
    }
}
