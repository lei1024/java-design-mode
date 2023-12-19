package com.lei.scene.solution;

import com.lei.scene.MinibusTargetService;

import java.util.Date;

/**
 * @author leijiahao
 * @date 2023-12-19
 */
public class LotteryServiceImpl extends LotteryService {

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    /**
     * @param uId
     * @return
     */
    @Override
    protected LotteryResult doDraw(String uId) {
        //摇号
        String lottery = minibusTargetService.lottery(uId);
        //结果
        return new LotteryResult(uId, lottery, new Date());
    }
}
