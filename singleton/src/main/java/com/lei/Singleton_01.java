package com.lei;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态类
 * 初始化类时就能初始化Map类,可以全局访问
 *
 * @author leijiahao
 * @date 2023-11-20
 */
public class Singleton_01 {
    public static Map<String, String> cache = new ConcurrentHashMap<>();
}
