package com.lei.visitor.impl;

import com.lei.user.impl.MTeacher;
import com.lei.user.impl.Student;
import com.lei.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author leijiahao
 * @date 2023-12-22
 */
public class Parent implements Visitor {
    private final Logger logger = LoggerFactory.getLogger(Parent.class);

    /**
     * @param student
     */
    @Override
    public void visitStudent(Student student) {
        logger.info("学生信息 姓名：{} 班级：{} 排名：{}", student.getName(), student.getClazz(), student.ranking());
    }

    /**
     * @param teacher
     */
    @Override
    public void visitTeacher(MTeacher teacher) {
        logger.info("教师信息 姓名：{} 班级：{}  升学率：{}", teacher.getName(), teacher.getClazz(), teacher.entranceRatio());
    }
}
