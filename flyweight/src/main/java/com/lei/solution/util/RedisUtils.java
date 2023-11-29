package com.lei.solution.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 模拟Redis工具类
 *
 * @author leijiahao
 * @date 2023-11-29
 */
public class RedisUtils {

    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
    private AtomicInteger stock = new AtomicInteger(0);

    public RedisUtils() {
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            stock.addAndGet(1);
        }, 0, 100000, TimeUnit.MICROSECONDS);
    }

    public int getStocked() {
        return stock.get();
    }
}
