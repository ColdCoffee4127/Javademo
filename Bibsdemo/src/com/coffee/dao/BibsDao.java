package com.coffee.dao;

import com.coffee.pojo.Account;
import com.coffee.pojo.Salary;
import com.coffee.pojo.User;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

public interface BibsDao {
    void InsertAcc(String account, String custName, String idCard, String company, String address, Date openTime, String accState, double balance, Connection con);
    void InsertUser(String userName, String realName, String password, String userRole, Connection con);
    String Login(String userName,String password,Connection con);
    Account QueryAcc(String account,Connection con);
    User QueryUser(String userName,Connection con);
    void Register(String userName, String password, String realName, Connection con);
    void Transfer(String transoutAcc, double transAmount, String transinAcc, Date transTime, String desc, Connection con);
    void UpdateAcc(String account, String custName, String idCard, String company, String address, Date openTime, String accState, double balance, Connection con);
    void UpdateUser(String userName, String realName, String password, String userRole, Connection con);
    void InsertSalary(int id, String compName, String empName, double salary, String payMonth, String comAcc, String empAcc, String idCard, String desc, String approve, Connection con);

    List<String> QueryTrans(Connection con);

    List<Salary> Queryaprove(int id, String compName, String empName, double salary, String payMonth, String comAcc, String empAcc, String idCard, String desc, String approve, Connection con);
}
