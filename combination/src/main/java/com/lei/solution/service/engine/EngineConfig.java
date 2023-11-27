package com.lei.solution.service.engine;

import com.lei.solution.service.logic.LogicFilter;
import com.lei.solution.service.logic.impl.UserAgeFilter;
import com.lei.solution.service.logic.impl.UserGenderFilter;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * 引擎配置
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public class EngineConfig {

    @Getter
    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new HashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public static void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        EngineConfig.logicFilterMap = logicFilterMap;
    }
}
