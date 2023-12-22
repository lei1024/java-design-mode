package com.lei.solution.test;

import com.lei.solution.DisCountStrategy;
import com.lei.solution.event.MJDiscount;
import com.lei.solution.event.NYDiscount;
import com.lei.solution.event.ZJDiscount;
import com.lei.solution.event.ZKDiscount;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * test
 *
 * @author leijiahao
 * @date 2023-12-22
 */
public class ApiTest {
    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_disCount() {
        //1.直减券
        DisCountStrategy<Double> zjDiscount = new DisCountStrategy<>(new ZJDiscount());
        logger.info("直减后的金额:{}", zjDiscount.discountAmount(10D, new BigDecimal(100)));
        //2.折扣券
        DisCountStrategy<Double> zkDiscount = new DisCountStrategy<>(new ZKDiscount());
        logger.info("折扣后的金额:{}", zkDiscount.discountAmount(0.9D, new BigDecimal(100)));
        //3.N元购
        DisCountStrategy<Double> nyDiscount = new DisCountStrategy<>(new NYDiscount());
        logger.info("N元购的金额:{}", nyDiscount.discountAmount(10D, new BigDecimal(100)));
        //4.满减券
        DisCountStrategy<Map<String, String>> mjDiscount = new DisCountStrategy<>(new MJDiscount());
        Map<String, String> mapReq = new HashMap<>();
        mapReq.put("x", "100");
        mapReq.put("n", "15");
        //满100减10
        logger.info("满减后的金额:{}", mjDiscount.discountAmount(mapReq, new BigDecimal(100)));
    }
}
