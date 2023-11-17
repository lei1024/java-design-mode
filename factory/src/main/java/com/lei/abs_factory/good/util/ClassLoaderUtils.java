package com.lei.abs_factory.good.util;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * 类加载器工具类
 *
 * @author leijiahao
 * @date 2023-11-14
 */
public class ClassLoaderUtils {
    public static Class<?>[] getClassByArgs(Object[] args) {
        Class<?>[] parameterTypes = new Class[args.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            if (args[i] instanceof ArrayList) {
                parameterTypes[i] = ArrayList.class;
            }
            if (args[i] instanceof LinkedList) {
                parameterTypes[i] = List.class;
                continue;
            }
            if (args[i] instanceof HashMap) {
                parameterTypes[i] = Map.class;
                continue;
            }
            if (args[i] instanceof Long){
                parameterTypes[i] = long.class;
                continue;
            }
            if (args[i] instanceof Double){
                parameterTypes[i] = double.class;
                continue;
            }
            if (args[i] instanceof TimeUnit){
                parameterTypes[i] = TimeUnit.class;
                continue;
            }
            parameterTypes[i] = args[i].getClass();
        }
        return parameterTypes;
    }
}
