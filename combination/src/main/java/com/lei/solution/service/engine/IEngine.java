package com.lei.solution.service.engine;

import com.lei.solution.model.aggregates.TreeRich;
import com.lei.solution.model.vo.EngineResult;

import java.util.Map;

/**
 * 引擎接口
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);
}
