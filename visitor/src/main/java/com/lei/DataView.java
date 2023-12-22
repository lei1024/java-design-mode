package com.lei;

import com.lei.user.User;
import com.lei.user.impl.MTeacher;
import com.lei.user.impl.Student;
import com.lei.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据视图
 *
 * @author leijiahao
 * @date 2023-12-22
 */
public class DataView {
    List<User> userList = new ArrayList<>();

    public DataView() {
        userList.add(new Student("谢⻜机", "᯿点班", "⼀年⼀班"));
        userList.add(new Student("windy", "᯿点班", "⼀年⼀班"));
        userList.add(new Student("⼤⽑", "普通班", "⼆年三班"));
        userList.add(new Student("Shing", "普通班", "三年四班"));
        userList.add(new MTeacher("BK", "特级教师", "⼀年⼀班"));
        userList.add(new MTeacher("娜娜Goddess", "特级教师", "⼀年⼀班"));
        userList.add(new MTeacher("dangdang", "普通教师", "⼆年三班"));
        userList.add(new MTeacher("泽东", "实习教师", "三年四班"));
    }

    //展示
    public void show(Visitor visitor) {
        for (User user : userList) {
            user.accept(visitor);
        }
    }
}
