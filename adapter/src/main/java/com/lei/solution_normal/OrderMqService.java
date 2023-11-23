package com.lei.solution_normal;

/**
 * @author leijiahao
 * @date 2023-11-23
 */
public class OrderMqService {
    public void onMessage(String message) {
        System.out.println("接收到消息：" + message);
    }
}
