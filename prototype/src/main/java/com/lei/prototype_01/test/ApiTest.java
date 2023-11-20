package com.lei.prototype_01.test;

import com.lei.prototype_01.QuestionBankController;
import org.junit.jupiter.api.Test;

/**
 * 测试
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class ApiTest {

    @Test
    public void test_questionBankController() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001093013"));
        System.out.println(questionBankController.createPaper("⼩明", "1000001093013"));
        System.out.println(questionBankController.createPaper("⼩红", "1000001093013"));

    }
}
