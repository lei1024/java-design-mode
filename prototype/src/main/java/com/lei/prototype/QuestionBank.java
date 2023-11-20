package com.lei.prototype;

import com.lei.prototye_00.AnswerQuestion;
import com.lei.prototye_00.ChoiceQuestion;
import com.lei.prototype.util.Topic;
import com.lei.prototype.util.TopicRandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * @author leijiahao
 * @date 2023-11-17
 */
public class QuestionBank implements Cloneable {
    private String candidate; // 考生
    private String number; // 考号
    private ArrayList<ChoiceQuestion> choiceQuestionArrayList = new ArrayList();
    private ArrayList<AnswerQuestion> answerQuestionArrayList = new ArrayList<>();

    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestionArrayList.add(choiceQuestion);
        return this;
    }

    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionArrayList.add(answerQuestion);
        return this;
    }

    @Override
    public QuestionBank clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        questionBank.choiceQuestionArrayList = (ArrayList<ChoiceQuestion>) choiceQuestionArrayList.clone();
        questionBank.answerQuestionArrayList = (ArrayList<AnswerQuestion>) answerQuestionArrayList.clone();
        // 题目乱序
        Collections.shuffle(questionBank.choiceQuestionArrayList);
        Collections.shuffle(questionBank.answerQuestionArrayList);
        // 答案乱序
        for (ChoiceQuestion choiceQuestion : questionBank.choiceQuestionArrayList) {
            Topic topic = TopicRandomUtil.randomTopic(choiceQuestion.getOption(), choiceQuestion.getKey());
            choiceQuestion.setKey(topic.getKey());
            choiceQuestion.setOption(topic.getOption());
        }
        return questionBank;

    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder detail = new StringBuilder("考生：" + candidate + "\r\n" + "考号：" + number + "\r\n" + "-----------------------------------------------\r\n" + "一、选择题" + "\r\n");
        for (int i = 0; i < choiceQuestionArrayList.size(); i++) {
            detail.append("第")
                  .append(i + 1)
                  .append("题")
                  .append(choiceQuestionArrayList.get(i)
                                                 .getName())
                  .append("\r\n");
            Map<String, String> option = choiceQuestionArrayList.get(i)
                                                                .getOption();
            for (String key : option.keySet()) {
                detail.append(key)
                        .append(":")
                        .append(option.get(key))
                        .append("\r\n");
                detail.append("答案:").append(choiceQuestionArrayList.get(i).getKey()).append("\r\n");
            }
        }
        detail.append("二、问答题" + "\r\n");
        for (int i = 0; i < answerQuestionArrayList.size(); i++) {
            detail.append("第")
                  .append(i + 1)
                  .append("题：")
                  .append(answerQuestionArrayList.get(i)
                                                 .getName())
                  .append("\r\n")
                  .append("答案：")
                  .append(answerQuestionArrayList.get(i)
                                                 .getKey())
                  .append("\r\n");
        }
        return detail.toString();
    }
}
