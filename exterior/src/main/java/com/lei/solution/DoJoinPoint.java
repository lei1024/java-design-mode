package com.lei.solution;

import com.alibaba.fastjson.JSON;
import com.lei.solution.annotation.DoDoor;
import com.lei.solution.config.StarterService;
import org.apache.commons.beanutils.BeanUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author leijiahao
 * @date 2023-11-29
 */
@Aspect
@Component
public class DoJoinPoint {
    private final Logger logger = LoggerFactory.getLogger(DoJoinPoint.class);
    @Autowired
    private StarterService starterService;

    @Pointcut("@annotation(com.lei.solution.annotation.DoDoor)")
    public void aopPoint() {
    }

    @Around("aopPoint()")
    public Object doRouter(ProceedingJoinPoint jp) throws Throwable {
        //获取方法
        Method method = getMethod(jp);
        // 获取注解
        DoDoor door = method.getAnnotation(DoDoor.class);

        String keyValue = getFiledValue(door.key(), jp.getArgs());
        logger.info("door handler method：{} value：{}", method.getName(), keyValue);
        if (null == keyValue || "".equals(keyValue)) {
            return jp.proceed();
        }
        String[] split = starterService.split(",");
        // 白名单过滤
        for (String splitStr : split) {
            if (keyValue.equals(splitStr)) {
                return jp.proceed();
            }
        }
        // 否则拦截
        return returnObject(door, method);

    }

    private Object returnObject(DoDoor door, Method method) throws InstantiationException, IllegalAccessException {
        Class<?> returnType = method.getReturnType();
        String json = door.returnJson();
        if ("".equals(json)) {
            return returnType.newInstance();
        } else {
            return JSON.parseObject(json, returnType);
        }
    }

    /**
     * 获取属性值
     *
     * @param key  属性名
     * @param args 参数
     * @return
     */
    private String getFiledValue(String key, Object[] args) {
        String filedValue = null;
        // 参数循环
        for (Object arg : args) {
            try {
                if (null == filedValue || filedValue.isEmpty()) {
                    //获取属性的值
                    filedValue = BeanUtils.getProperty(arg, key);
                } else {
                    break;
                }
            } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
                if (args.length == 1) {
                    return args[0].toString();
                }
            }
        }
        return filedValue;
    }

    private Method getMethod(ProceedingJoinPoint jp) throws NoSuchMethodException {
        // 获取连接点的方法签名对象
        Signature signature = jp.getSignature();
        // 强转成方法签名
        MethodSignature methodSignature = (MethodSignature) signature;
        // 通过方法签名对象获取方法
        return jp.getTarget()
                 .getClass()
                 .getMethod(methodSignature.getName(), methodSignature.getParameterTypes());
    }


}
