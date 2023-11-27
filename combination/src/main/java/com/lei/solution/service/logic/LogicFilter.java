package com.lei.solution.service.logic;

import com.lei.solution.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * 过滤逻辑
 * 定义了适配的通用接口,逻辑决策器,获取决策值,让每一个提供决策能力的节点都必须实现这个接口,保证统一性
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public interface LogicFilter {
    /**
     * 逻辑决策器
     *
     * @param matterValue
     * @param treeNodeLinkList
     * @return
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList);

    /**
     * 获取决策值
     */
    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);
}
