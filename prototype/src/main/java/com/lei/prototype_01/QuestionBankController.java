package com.lei.prototype_01;

import com.lei.prototye_00.AnswerQuestion;
import com.lei.prototye_00.ChoiceQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 答案选择
 *
 * @author leijiahao
 * @date 2023-11-17
 */
public class QuestionBankController {

    public String createPaper(String candidate, String number) {
        List<ChoiceQuestion> choiceQuestionList = new ArrayList<>();
        List<AnswerQuestion> answerQuestionList = new ArrayList<>();
        Map<String, String> map01 = new HashMap<>();
        map01.put("A", "Java2 EE");
        map01.put("B", "Java2 Card");
        map01.put("C", "Java2 ME");
        map01.put("D", "Java2 HE");
        map01.put("E", "Java2 SE");
        Map<String, String> map02 = new HashMap<>();
        map02.put("A", "JAVA程序的main⽅法必须写在类⾥⾯");
        map02.put("B", "JAVA程序中可以有多个main⽅法");
        map02.put("C", "JAVA程序中类名必须与⽂件名⼀样");
        map02.put("D", "JAVA程序的main⽅法中如果只有⼀条语句，可以不⽤{}(⼤括号)括起来");
        Map<String, String> map03 = new HashMap<>();
        map03.put("A", "变量量由字⺟母、下划线、数字、$符号随意组成；");
        map03.put("B", "变量量不不能以数字开头；");
        map03.put("C", "A和a在java中是同⼀个变量量；");
        map03.put("D", "不不同类型的变量量，可以起相同的名字；");
        Map<String, String> map04 = new HashMap<>();
        map04.put("A", "String");
        map04.put("B", "x3xo");
        map04.put("C", "void");
        map04.put("D", "de$f");
        Map<String, String> map05 = new HashMap<>();
        map05.put("A", "31");
        map05.put("B", "0");
        map05.put("C", "1");
        map05.put("D", "2");
        choiceQuestionList.add(new ChoiceQuestion("Java所定义的版本中不不包括", map01, "D"));
        choiceQuestionList.add(new ChoiceQuestion("下列说法正确的是", map02, "A"));
        choiceQuestionList.add(new ChoiceQuestion("变量命名规范说法正确的是",
                map03, "B"));
        choiceQuestionList.add(new ChoiceQuestion("以下()不是合法的标识符",
                map04, "C"));
        choiceQuestionList.add(new ChoiceQuestion("表达式(11+3*8)/4%3的值是", map05, "D"));
        answerQuestionList.add(new AnswerQuestion("⼩红⻢和⼩⿊⻢⽣的⼩⻢⼏条腿", "4条腿"));
        answerQuestionList.add(new AnswerQuestion("铁棒打头疼还是⽊棒打头疼",
                "头最疼"));
        answerQuestionList.add(new AnswerQuestion("什么床不能睡觉", "⽛床"));
        answerQuestionList.add(new AnswerQuestion("为什么好⻢不吃回头草", "⾯的草没了"));
        //输出结果
        StringBuilder detail = new StringBuilder("考⽣：" + candidate + "\r\n" + "考号：" + number + "\r\n" + "-----------------------------------------------\r\n" + "⼀、选择题" + "\r\n");
        for (int i = 0; i < choiceQuestionList.size(); i++) {
            detail.append("第")
                  .append(i + 1)
                  .append("题：")
                  .append(choiceQuestionList.get(i)
                                            .getName())
                  .append("\r\n");
            Map<String, String> option = choiceQuestionList.get(i)
                                                           .getOption();
            for (String key : option.keySet()) {
                detail.append(key)
                      .append("：")
                      .append(option.get(key))
                      .append("\r\n");
            }
            detail.append("答案：")
                  .append(choiceQuestionList.get(i)
                                            .getKey())
                  .append("\r\n");
        }
        detail.append("⼆、问答题" + "\r\n");
        for (int i = 0; i < answerQuestionList.size(); i++) {
            detail.append("第")
                  .append(i + 1)
                  .append("题：")
                  .append(answerQuestionList.get(i)
                                            .getName())
                  .append("\r\n")
                  .append("答案：")
                  .append(answerQuestionList.get(i)
                                            .getKey())
                  .append("\r\n");
        }

        return detail.toString();

    }
}
