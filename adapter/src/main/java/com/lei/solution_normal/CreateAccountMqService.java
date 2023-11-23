package com.lei.solution_normal;

import com.alibaba.fastjson2.JSON;
import com.lei.scene.mq.CreateAccount;

/**
 * 创建用户服务处理
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class CreateAccountMqService {
    public void onMessage(String message) {
        System.out.println("接收到消息：" + message);
        CreateAccount createAccountMq = JSON.parseObject(message, CreateAccount.class);
        createAccountMq.getNumber();

    }
}
