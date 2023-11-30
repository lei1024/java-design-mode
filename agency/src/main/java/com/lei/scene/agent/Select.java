package com.lei.scene.agent;

import java.lang.annotation.*;

/**
 * Select注解
 *
 * @author leijiahao
 * @date 2023-11-30
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {

    String value() default ""; // SQL语句
}
