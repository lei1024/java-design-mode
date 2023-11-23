package com.lei.solution.mode;

/**
 * 支付方式
 *
 * @author leijiahao
 * @date 2023-11-23
 */
public interface IPayMode {
    boolean security(String uid);
}
