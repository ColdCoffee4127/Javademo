package com.jdbc.pojo;

/**
 * @ClassName User
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-20 15:56
 * @Version 1.0
 **/
public class User {
    private int id;
    private String name;
    private int age;
    private String address;
    private int studentNo;
    private String studentName;
    private String phone;
    private String loginPwd;
    public User(int id,String name,int age,String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public User(int studentNo,String studentName,String phone,String address){
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.phone = phone;
        this.address = address;
    }
    public User(String studentName,String loginPwd){
        this.studentName = studentName;
        this.loginPwd = loginPwd;
    }


    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }
}
