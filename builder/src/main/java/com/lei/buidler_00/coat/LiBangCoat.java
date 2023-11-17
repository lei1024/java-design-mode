package com.lei.buidler_00.coat;

import com.lei.buidler_00.Matter;

import java.math.BigDecimal;

/**
 * 立邦涂料
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class LiBangCoat implements Matter {

    /**
     * @return
     */
    @Override
    public String scene() {
        return "涂料";
    }

    /**
     * @return
     */
    @Override
    public String brand() {
        return "立邦(LiBang)";
    }

    /**
     * @return
     */
    @Override
    public String model() {
        return "默认级别";
    }

    /**
     * @return
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(380);
    }

    /**
     * @return
     */
    @Override
    public String desc() {
        return "立邦始终以开发绿色产品、注重环境保护为己任，以“提供优质产品和服务，创造美好生活”为企业使命，以“成为卓越的、可持续发展的涂料和化工企业”为愿景，以“诚信、创新、卓越、共赢”为核心价值观，以“客户、员工、股东、社会”为利益相关者，以“客户第一、员工为本、股东满意、社会信赖”为经营理念，以“以人为本、安全第一、环境友好、品质为先、诚信守法、持续改进、共创价值”为立邦精神。";
    }
}
