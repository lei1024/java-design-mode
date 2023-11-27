package com.lei.solution.service.engine.impl;

import com.lei.solution.model.aggregates.TreeRich;
import com.lei.solution.model.vo.EngineResult;
import com.lei.solution.model.vo.TreeNode;
import com.lei.solution.service.engine.EngineBase;

import java.util.Map;

/**
 * 树逻辑处理
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public class TreeEngineHandle extends EngineBase {
    /**
     * @param treeId
     * @param userId
     * @param treeRich
     * @param decisionMatter
     * @return
     */
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
