package com.lei.solution.service.logic.impl;


import com.lei.solution.service.logic.BaseLogic;

import java.util.Map;

/**
 * 性别节点
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public class UserGenderFilter extends BaseLogic {
    /**
     * @param treeId
     * @param userId
     * @param decisionMatter
     * @return
     */
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }
}
