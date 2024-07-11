package com.coffee.service;

import com.coffee.pojo.Account;
import com.coffee.pojo.User;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

public interface BibsService {
    int InsertAcc(String account, String custName, String idCard, String company, String address, Date openTime, String accState, double balance);
    int InsertUser(String userName,String realName,String password,String userRole);
    String Login(String userName,String password);
    Account QueryAcc(String account);
    User QueryUser(String userName);
    int Register(String userName,String password,String realName);
    int Transfer(String transoutAcc, double transAmount, String transinAcc, Date transTime, String desc);
    int UpdateAcc(String account, String custName, String idCard, String company, String address, Date openTime, String accState, double balance);
    int UpdateUser(String userName,String realName,String password,String userRole);
    int InsertSalary(int id, String compName, String empName, double salary, String payMonth, String comAcc, String empAcc, String idCard, String desc, String approve);
    List<String> Querytrans();
}
