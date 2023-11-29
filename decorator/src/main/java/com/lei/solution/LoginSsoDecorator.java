package com.lei.solution;

import com.lei.scene.HandleInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 单点登录装饰器-扩展服务
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public class LoginSsoDecorator extends SsoDecorator {
    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    private final Logger logger = LoggerFactory.getLogger(LoginSsoDecorator.class);

    public LoginSsoDecorator(HandleInterceptor handleInterceptor) {
        super(handleInterceptor);
    }

    /**
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean success = super.preHandle(request, response, handler);
        if (!success) {
            return false;
        }
        String userId = request.substring(8);
        String method = authMap.get(userId);
        logger.info("模拟单点登录方法访问拦截校验:{},{}", userId, method);
        // 模拟方法校验
        return "queryUserInfo".equals(method);
    }
}
