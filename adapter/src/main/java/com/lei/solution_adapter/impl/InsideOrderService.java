package com.lei.solution_adapter.impl;

import com.lei.scene.service.OrderService;
import com.lei.solution_adapter.OrderAdapterService;

/**
 * 内部服务
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class InsideOrderService implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    /**
     * @param uId
     * @return
     */
    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
