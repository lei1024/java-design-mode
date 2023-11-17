package com.lei.builder_02.test;

import com.lei.builder_02.Builder;
import org.junit.jupiter.api.Test;

/**
 * 测试builder
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class ApiTest {

    @Test
    public void test_builder() {
        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(132.52D)
                                  .getDetail());
        // 轻奢⽥园
        System.out.println(builder.levelTwo(98.25D)
                                  .getDetail());
        // 现代简约
        System.out.println(builder.levelThree(65.66D)
                                  .getDetail());
    }
}
