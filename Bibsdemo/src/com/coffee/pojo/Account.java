package com.coffee.pojo;

import java.util.Date;

/**
 * @ClassName Account
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 09:37
 * @Version 1.0
 **/
public class Account {
    private String account;
    private String custName;
    private String idCard;
    private String company;
    private String address;
    private Date openTime;
    private String accState;
    private double balance;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public String getAccState() {
        return accState;
    }

    public void setAccState(String accState) {
        this.accState = accState;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", custName='" + custName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", company='" + company + '\'' +
                ", address='" + address + '\'' +
                ", openTime=" + openTime +
                ", accState='" + accState + '\'' +
                ", balance=" + balance +
                '}';
    }
}
