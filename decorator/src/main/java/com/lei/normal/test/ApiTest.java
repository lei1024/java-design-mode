package com.lei.normal.test;

import com.lei.normal.LoginSsoDecorator;
import org.junit.jupiter.api.Test;

/**
 * test
 *
 * @author leijiahao
 * @date 2023-11-27
 */
public class ApiTest {
    @Test
    public void test_loginSsoIntercept() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator();
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu",
                "t");
        System.out.println("登录校验：" + request + (success ? " 放⾏" : " 拦截"));
    }
}
