package com.lei.solution;

import com.lei.scene.Status;
import com.lei.solution.state.CheckState;
import com.lei.solution.state.EditingState;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * handler
 * 状态处理服务
 * 这是对状态服务的统⼀控制中⼼，可以看到在构造函数中提供了所有状态和实现的具体关联，放到
 * Map数据结构中。
 * 同时提供了不同名称的操作类,让外部调用方可以更加容易的使用此项功能接口
 *
 * @author leijiahao
 * @date 2023-12-19
 */
public class StateHandler {
    private Map<Enum<Status>, State> stateMap = new ConcurrentHashMap<>();

    public StateHandler() {
        stateMap.put(Status.check, new CheckState());
        stateMap.put(Status.editing, new EditingState());
    }

    public Result arriagnment(String activityId, Enum<Status> currentStatus) {
        //父类定义的方法，从map中获取对应的状态实现类，然后调用同名方法,传递同样的参数,
        //重要的一点,没有了if else
        return stateMap.get(currentStatus)
                       .arraignment(activityId, currentStatus);
    }
}
