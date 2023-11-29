package com.lei.solution.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 白名单注解
 *
 * @author leijiahao
 * @date 2023-11-28
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoDoor {
    String key() default "";

    String returnJson() default "";

}
