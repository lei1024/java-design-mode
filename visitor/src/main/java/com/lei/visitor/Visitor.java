package com.lei.visitor;

import com.lei.user.impl.MTeacher;
import com.lei.user.impl.Student;

/**
 * 访问者
 *
 * @author leijiahao
 * @date 2023-12-22
 */
public interface Visitor {
    // 访问学生
    void visitStudent(Student student);

    // 访问老师
    void visitTeacher(MTeacher teacher);

}
