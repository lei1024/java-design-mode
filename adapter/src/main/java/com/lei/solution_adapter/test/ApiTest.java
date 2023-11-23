package com.lei.solution_adapter.test;

import com.alibaba.fastjson2.JSON;
import com.lei.scene.mq.CreateAccount;
import com.lei.scene.mq.OrderMq;
import com.lei.solution_adapter.MqAdapter;
import com.lei.solution_adapter.OrderAdapterService;
import com.lei.solution_adapter.RebateInfo;
import com.lei.solution_adapter.impl.InsideOrderService;
import com.lei.solution_adapter.impl.POPOrderAdapterServiceImpl;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * API测试
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public class ApiTest {

    @Test
    public void test_MqAdapter() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        CreateAccount createAccount = new CreateAccount();
        createAccount.setNumber("100001");
        createAccount.setAddress("北京市朝阳区");
        createAccount.setAccountDate(new Date());
        createAccount.setDesc("在校开户");

        HashMap<String, String> link01 = new HashMap<>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MqAdapter.filter(JSON.toJSONString(createAccount), link01);
        System.out.println("mq.create_account(适配前)" + JSON.toJSONString(createAccount));
        System.out.println("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo01));
        System.out.println("");
        OrderMq orderMq = new OrderMq();
        orderMq.setOrderId("12312312312");
        orderMq.setUid("10001");
        orderMq.setSku("1000001");
        orderMq.setCreateOrderTime(new Date());
        Map<String, String> link02 = new HashMap<>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        // link02 其实就是一个字段的映射关系
        RebateInfo rebateInfo02 = MqAdapter.filter(JSON.toJSONString(orderMq), link02);
        System.out.println("mq.order(适配前)" + JSON.toJSONString(orderMq));
        System.out.println("mq.order(适配后)" + JSON.toJSONString(rebateInfo02));


    }

    @Test
    public void test_itfAdapter() {
        OrderAdapterService orderAdapterService = new POPOrderAdapterServiceImpl();
        System.out.println("判断首单,接口适配(POP):" + orderAdapterService.isFirst("10001"));
        OrderAdapterService orderAdapterService1 = new InsideOrderService();
        System.out.println("判断首单,接口适配(自营):" + orderAdapterService1.isFirst("10001"));
    }
}
