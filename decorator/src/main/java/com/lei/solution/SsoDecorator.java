package com.lei.solution;

import com.lei.scene.HandleInterceptor;

/**
 * SSO装饰器
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public class SsoDecorator implements HandleInterceptor {
    private HandleInterceptor handleInterceptor;

    private SsoDecorator() {
    }

    public SsoDecorator(HandleInterceptor handleInterceptor) {
        this.handleInterceptor = handleInterceptor;
    }

    /**
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handleInterceptor.preHandle(request, response, handler);
    }
}
