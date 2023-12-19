package com.lei.scene.normal;

import com.lei.scene.MinibusTargetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author leijiahao
 * @date 2023-12-19
 */
public class LotteryServiceImpl implements LotteryService {
    private final Logger logger = LoggerFactory.getLogger(LotteryServiceImpl.class);

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    public LotteryResult doDraw(String uId) {
        //摇号
        String lottery = minibusTargetService.lottery(uId);
        //发短信
        logger.info("给用户 {} 发送短信通知(短信)：{}", uId, lottery);
        //发MQ消息
        logger.info("记录用户 {} 摇号结果(MQ)：{}", uId, lottery);
        //结果
        return new LotteryResult(uId, lottery, new Date());
    }
    // 对于这个场景中,可以看到,除了摇号是核心流程,其他都是可以拆分出来的,比如发短信,发MQ消息,记录摇号结果等,这样的话,就可以使用观察者模式来实现了
}
