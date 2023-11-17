package com.lei.builder_01.test;

import com.lei.builder_01.DecorationPackageController;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @author leijiahao
 * @date 2023-11-17
 */
public class ApiTest {

    @Test
    public void test_decorationPackageController() {
        DecorationPackageController decorationPackageController = new DecorationPackageController();
        // 豪华欧式
        System.out.println(decorationPackageController.getMatterList(new BigDecimal("132.52"),1));
        // 轻奢⽥园
        System.out.println(decorationPackageController.getMatterList(new BigDecimal("98.25"),2));
        // 现代简约
        System.out.println(decorationPackageController.getMatterList(new BigDecimal("85.43"),3));
    }
}
