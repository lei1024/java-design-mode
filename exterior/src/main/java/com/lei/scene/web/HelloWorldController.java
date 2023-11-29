package com.lei.scene.web;

import com.lei.scene.domain.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 控制器
 *
 * @author leijiahao
 * @date 2023-11-27
 */
@RestController
public class HelloWorldController {

    @Value("${server.port}")
    private int port;

    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public UserInfo queryUserInfo(@RequestParam String userId) {
        return new UserInfo("虫虫:" + userId, 19, "天津市南开区旮旯胡同100号");
    }

    public UserInfo queryUserInfoFallback(@RequestParam String userId) {
        // 模拟白名单校验
        List<String> userList = new ArrayList<>();
        userList.add("10001");
        userList.add("aaa");
        userList.add("bbb");
        if (!userList.contains(userId)) {
            return new UserInfo("111", "非白名单用户不能访问");
        }
        return new UserInfo("成功", "通过白名单校验");
    }
}
