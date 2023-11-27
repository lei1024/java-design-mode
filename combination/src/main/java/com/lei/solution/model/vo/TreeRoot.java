package com.lei.solution.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 树根信息
 *
 * @author leijiahao
 * @date 2023-11-27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeRoot {
    /**
     * 规则树ID
     */
    private Long treeId;
    /**
     * 规则树根ID
     */
    private Long treeRootNodeId;
    /**
     * 规则树名称
     */
    private String treeName;
}
