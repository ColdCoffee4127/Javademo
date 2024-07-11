package com.coffee.pojo;

import java.util.Date;

/**
 * @ClassName Transfer
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 09:37
 * @Version 1.0
 **/
public class Transfer {
    private int id;
    private String transOutAcc;
    private String transAmount;
    private Date transTime;
    private String transInAcc;
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransOutAcc() {
        return transOutAcc;
    }

    public void setTransOutAcc(String transOutAcc) {
        this.transOutAcc = transOutAcc;
    }

    public String getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(String transAmount) {
        this.transAmount = transAmount;
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    public String getTransInAcc() {
        return transInAcc;
    }

    public void setTransInAcc(String transInAcc) {
        this.transInAcc = transInAcc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "id=" + id +
                ", transOutAcc='" + transOutAcc + '\'' +
                ", transAmount='" + transAmount + '\'' +
                ", transTime=" + transTime +
                ", transInAcc='" + transInAcc + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
