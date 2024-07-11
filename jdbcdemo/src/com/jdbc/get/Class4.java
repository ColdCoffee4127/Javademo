package com.jdbc.get;

import com.jdbc.pojo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @ClassName Class4
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-21 21:20
 * @Version 1.0
 **/
public class Class4 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement prs = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/school";
            con = DriverManager.getConnection(url,"root","123456");
            Scanner scan = new Scanner(System.in);
            System.out.print("请输入用户名：");
            String studentName = scan.next();
            System.out.print("请输入密码：");
            String loginPwd = scan.next();
            String sql = "select * from student where studentName = ? and loginPwd = ?";
            prs = con.prepareStatement(sql);
            prs.setString(1,studentName);
            prs.setString(2,loginPwd);
            System.out.println(sql);
            rs = prs.executeQuery();
            User u = null;
            if(rs.next()){
                u = new User(rs.getString("studentName"),rs.getString("loginPwd"));
            }
            if(u != null){
                System.out.println("登录成功，欢迎！");
            }else{
                System.out.println("登陆失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(rs != null) rs.close();
                if(prs != null) prs.close();
                if(con != null) con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
