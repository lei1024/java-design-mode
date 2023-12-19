package com.lei.scene.solution.event.listener;

import com.lei.scene.solution.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 消息监听器
 *
 * @author leijiahao
 * @date 2023-12-19
 */
public class MessageEventListener implements EventListener {
    private final Logger logger = LoggerFactory.getLogger(MessageEventListener.class);

    /**
     * @param result
     */
    @Override
    public void doEvent(LotteryResult result) {
        logger.info("给用户{}发短信通知{}", result.getuId(), result.getMsg());
    }
}
