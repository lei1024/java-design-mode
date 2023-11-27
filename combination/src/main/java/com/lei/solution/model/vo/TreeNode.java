package com.lei.solution.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 树节点;子叶节点/果实节点
 *
 * @author leijiahao
 * @date 2023-11-27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {
    /**
     * 规则树ID
     */
    private Long treeId;
    /**
     * 规则树节点ID
     */
    private Long treeNodeId;
    /**
     * 节点类型:1.子叶 2.果实
     */
    private Integer nodeType;
    /**
     * 节点值
     */
    private String nodeValue;
    /**
     * 规则Key
     */
    private String ruleKey;
    /**
     * 规则描述
     */
    private String ruleDesc;
    /**
     * 节点链路
     */
    private List<TreeNodeLink> treeNodeLinkList;
}
