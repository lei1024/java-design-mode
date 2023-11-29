package com.lei.scene;


/**
 * 单点登录
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public class SsoInterceptor implements HandleInterceptor {

    /**
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取cookie
        String ticket = request.substring(1, 8);
        //模拟校验
        return ticket.equals("success");
    }
}

