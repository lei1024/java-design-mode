package com.lei.solution.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 决策返回对象信息
 *
 * @author leijiahao
 * @date 2023-11-27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EngineResult {
    /**
     * 执行结果
     */
    private boolean isSuccess;
    /**
     * 用户ID
     */
    private String userId;
    private Long treeId;
    /**
     * 规则树ID
     */
    private Long nodeId;
    /**
     * 果实节点值
     */
    private String nodeValue;

    public EngineResult(String userId, Long treeId, Long treeNodeId, String nodeValue) {
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = treeNodeId;
        this.nodeValue = nodeValue;
    }
}
