package com.coffee.dao.impl;

import com.coffee.dao.BibsDao;
import com.coffee.pojo.Account;
import com.coffee.pojo.Salary;
import com.coffee.pojo.User;
import com.coffee.util.JdbcUtils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BibsDaoImpl
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 11:43
 * @Version 1.0
 **/
public class BibsDaoImpl implements BibsDao {
    @Override
    public void InsertAcc(String account, String custName, String idCard, String company, String address, Date openTime, String accState, double balance, Connection con) {
        PreparedStatement ps = null;
        try {
            String sql = "insert into bibms_account values(?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,account);
            ps.setString(2,custName);
            ps.setString(3,idCard);
            ps.setString(4,company);
            ps.setString(5,address);
            ps.setDate(6,new java.sql.Date(openTime.getTime()));
            ps.setString(7,accState);
            ps.setDouble(8,balance);
            ps.executeUpdate();
        } catch (Exception e){
            throw  new RuntimeException(e);
        }
    }

    @Override
    public void InsertUser(String userName, String realName, String password, String userRole, Connection con){
        PreparedStatement ps = null;
        try{
            String sql = "insert into bibms_user values(?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,userName);
            ps.setString(2,realName);
            ps.setString(3,password);
            ps.setString(4,userRole);
            ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String Login(String userName, String password,Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            con = JdbcUtils.getConnection();
            String sql = "select userRole from bibms_user where userName = ? and password = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,userName);
            ps.setString(2,password);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getString("userRole");
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Account QueryAcc(String account,Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            String sql = "select * from bibms_account where account = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,account);
            rs = ps.executeQuery();
            Account acc = null;
            if(rs.next()){
                acc = new Account();
                acc.setAccount(rs.getString("account"));
                acc.setCustName(rs.getString("custName"));
                acc.setIdCard(rs.getString("idCard"));
                acc.setCompany(rs.getString("company"));
                acc.setAddress(rs.getString("address"));
                acc.setOpenTime(rs.getDate("openTime"));
                acc.setAccState(rs.getString("accState"));
                acc.setBalance(rs.getDouble("balance"));
                return acc;
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public User QueryUser(String userName,Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            String sql = "select * from bibms_user where userName = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,userName);
            rs = ps.executeQuery();
            User user = null;
            if(rs.next()){
                user = new User();
                user.setUserName(rs.getString("userName"));
                user.setPassword(rs.getString("password"));
                user.setRealName(rs.getString("realdName"));
                user.setUserRole(rs.getString("userRole"));
                return user;
            }else return null;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public void Register(String userName, String password, String realName, Connection con) {
        PreparedStatement ps = null;
        try{
            String sql = "insert into bibms_user(userName,password,realdName,userRole) values(?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,userName);
            ps.setString(2,password);
            ps.setString(3,realName);
            ps.setString(4,"4");
            ps.executeUpdate();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void Transfer(String transoutAcc, double transAmount, String transinAcc, Date transTime, String desc, Connection con) {
        PreparedStatement ps = null;
        try {
            String sql1 = "update bibms_account set balance = balance - transAmount where account = transoutAcc";
            String sql2 = "update bibms_account set balance = balance + transAmount where account = transintAcc";
            ps = con.prepareStatement(sql1);
            ps.setDouble(1,transAmount);
            ps.setString(2,transoutAcc);
            ps.executeUpdate();
            ps = con.prepareStatement(sql2);
            ps.setDouble(1,transAmount);
            ps.setString(2,transinAcc);
            String sql = "insert into bibms_transfer(transoutAcc,transAmount,transinAcc,transTime,desc) values(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,transoutAcc);
            ps.setDouble(2,transAmount);
            ps.setDate(3,transTime);
            ps.setString(4,transinAcc);
            ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void UpdateAcc(String account, String custName, String idCard, String company, String address, Date openTime, String accState, double balance, Connection con) {
        PreparedStatement ps = null;
        try{
            String sql = "update bibms_account set custName = ? ,idCard = ?,company = ?,address = ?,openTime = ?,accState = ?,balance = ? where account = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,account);
            ps.setString(2,custName);
            ps.setString(3,idCard);
            ps.setString(4,company);
            ps.setString(5,address);
            ps.setDate(6,openTime);
            ps.setString(7,accState);
            ps.setDouble(8,balance);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void UpdateUser(String userName, String realName, String password, String userRole, Connection con) {
        PreparedStatement ps = null;
        try{
            String sql = "update bibms_user where realName = ? set userName = ? ,password = ?,userRole = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,realName);
            ps.setString(2,userName);
            ps.setString(3,password);
            ps.setString(4,userRole);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<String> QueryTrans(Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            String sql = "select account from bibms_account";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            List<String> acc = new ArrayList<>();
            while(rs.next()){
                String account;
                account = rs.getString("account");
                acc.add(account);
            }
            if(acc.isEmpty()) {
                return null;
            }else{
                return acc;
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Salary> Queryaprove(int id, String compName, String empName, double salary, String payMonth, String comAcc, String empAcc, String idCard, String desc, String approve, Connection con) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            String sql = "select * from bibms_salary where approve = 'Œ¥…Û≈˙' ";
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();
            List <Salary> sala = new ArrayList<>();
            while(rs.next()){
                Salary s = new Salary();
                s.setId(rs.getInt("id"));
                s.setCompName(rs.getString("compName"));
                s.setEmpName(rs.getString("empName"));
                s.setSalary(rs.getDouble("salary"));
                s.setPayMonth(rs.getString("payMonth"));
                s.setCompName(rs.getString("comAcc"));
                s.setEmpAcc(rs.getString("empAcc"));
                s.setIdCard(rs.getString("idCard"));
                s.setDesc(rs.getString("desc"));
                s.setApprove(rs.getString("approve"));
                sala.add(s);
            }
            if(sala.isEmpty()){
                return null;
            }else{
                return sala;
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void InsertSalary(int id, String compName,String empName, double salary,String payMonth, String comAcc, String empAcc, String idCard, String desc, String approve, Connection con) {
        PreparedStatement ps;
        try {
            String sql = "insert into bibms_salary values(?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.setString(2,compName);
            ps.setString(3,empName);
            ps.setDouble(4,salary);
            ps.setString(5,payMonth);
            ps.setString(6,comAcc);
            ps.setString(7,empAcc);
            ps.setString(8,idCard);
            ps.setString(9,desc);
            ps.setString(10,approve);
            ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void Updateaprove(int id, String compName, String empName, double salary, String payMonth, String comAcc, String empAcc, String idCard, String desc, String approve){

    }

}
