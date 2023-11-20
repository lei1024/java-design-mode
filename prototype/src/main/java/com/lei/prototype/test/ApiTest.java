package com.lei.prototype.test;

import com.lei.prototype.QuestionBankController;
import org.junit.jupiter.api.Test;

/**
 * @author leijiahao
 * @date 2023-11-20
 */
public class ApiTest {

    @Test
    public void test() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001093013"));
        System.out.println(questionBankController.createPaper("⼩明", "1000001093013"));
        System.out.println(questionBankController.createPaper("⼩红", "1000001093013"));
    }
}
