package com.coffee.test;

/**
 * @ClassName School
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-27 20:12
 * @Version 1.0
 **/
public class School {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("����",16,"��");
        stu1.setAge(18);
        stu1.setName("����");
        stu1.setSex("��");
        System.out.println(stu1.getName() + ' ' + stu1.getAge() + ' ' + stu1.getSex());
        System.out.println(stu2.getName() + ' ' + stu2.getAge() + ' ' + stu2.getSex());
    }
}
