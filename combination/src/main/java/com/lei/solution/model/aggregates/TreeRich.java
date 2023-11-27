package com.lei.solution.model.aggregates;

import com.lei.solution.model.vo.TreeNode;
import com.lei.solution.model.vo.TreeRoot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * 聚合对象,包含组织树信息
 *
 * @author leijiahao
 * @date 2023-11-27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeRich {
    /**
     * 规则树根信息
     */
    private TreeRoot treeRoot;
    /**
     * 树节点Id->子节点
     */
    private Map<Long, TreeNode> treeNodeMap;
}
