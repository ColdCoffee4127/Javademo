package com.coffee.test;

/**
 * @ClassName Student
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-27 20:12
 * @Version 1.0
 **/
public class Student {
    private String name;
    private int age;
    private String sex;
    public Student(){};
    public Student(String name,int age,String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
