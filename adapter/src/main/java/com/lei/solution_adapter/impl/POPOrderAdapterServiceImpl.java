package com.lei.solution_adapter.impl;

import com.lei.scene.service.POPOrderService;
import com.lei.solution_adapter.OrderAdapterService;

/**
 * @author leijiahao
 * @date 2023-11-23
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {
    POPOrderService popOrderService = new POPOrderService();

    /**
     * @param uId
     * @return
     */
    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
