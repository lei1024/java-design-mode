package com.lei.scene.solution.event.listener;

import com.lei.scene.solution.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Mq消息监听器
 *
 * @author leijiahao
 * @date 2023-12-19
 */
public class MQEventListener implements EventListener {
    private final Logger logger = LoggerFactory.getLogger(MQEventListener.class);

    /**
     * @param result
     */
    @Override
    public void doEvent(LotteryResult result) {
        logger.info("记录用户 {} 摇号结果(MQ)：{}", result.getuId(), result.getMsg());
    }
}
