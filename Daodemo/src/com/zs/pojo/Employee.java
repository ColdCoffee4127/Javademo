package com.zs.pojo;

/**
 * @ClassName Employee
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 14:53
 * @Version 1.0
 **/
public class Employee {
    private int id;
    private String name;
    private String gender;
    private double salary;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(){}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    ;
    public Employee(int id,String name,String gender,double salary){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

}
