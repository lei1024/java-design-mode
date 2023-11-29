package com.lei.normal;

import com.lei.scene.SsoInterceptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 模拟登录
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public class LoginSsoDecorator extends SsoInterceptor {
    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    /**
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        //模拟获取Cookie
        String ticket = request.substring(1, 8);
        // 模拟校验
        boolean success = ticket.equals("success");
        if (!success) {
            return false;
        }
        String userId = request.substring(9);
        String method = authMap.get(userId);
        //模拟方法校验
        return "queryUserInfo".equals(method);
    }
}
