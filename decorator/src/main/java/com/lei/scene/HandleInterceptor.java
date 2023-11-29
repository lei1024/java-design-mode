package com.lei.scene;

/**
 * 处理拦截器
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public interface HandleInterceptor {
    boolean preHandle(String request, String response, Object handler);
}
