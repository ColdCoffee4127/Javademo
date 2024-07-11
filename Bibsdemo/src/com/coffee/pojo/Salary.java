package com.coffee.pojo;

import java.util.Date;

/**
 * @ClassName Salary
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 09:38
 * @Version 1.0
 **/
public class Salary {
    private int id;
    private String compName;
    private String empName;
    private double salary;
    private String payMonth;
    private Date openTime;
    private String compAcc;
    private String empAcc;
    private String idCard;
    private String desc;
    private String approve;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(String payMonth) {
        this.payMonth = payMonth;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public String getCompAcc() {
        return compAcc;
    }

    public void setCompAcc(String compAcc) {
        this.compAcc = compAcc;
    }

    public String getEmpAcc() {
        return empAcc;
    }

    public void setEmpAcc(String empAcc) {
        this.empAcc = empAcc;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getApprove() {
        return approve;
    }

    public void setApprove(String approve) {
        this.approve = approve;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", compName='" + compName + '\'' +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", payMonth='" + payMonth + '\'' +
                ", openTime=" + openTime +
                ", compAcc='" + compAcc + '\'' +
                ", empAcc='" + empAcc + '\'' +
                ", idCard='" + idCard + '\'' +
                ", desc='" + desc + '\'' +
                ", approve='" + approve + '\'' +
                '}';
    }
}
