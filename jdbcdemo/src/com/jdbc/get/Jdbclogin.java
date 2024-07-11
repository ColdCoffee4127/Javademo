package com.jdbc.get;

import com.jdbc.pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Jdbc
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-20 15:10
 * @Version 1.0
 **/
public class Jdbclogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/test";
            con = DriverManager.getConnection(url,"root","123456");
            //3.定义sql语句
            System.out.println("用户名：");
            String studentName = scan.next();
            System.out.println("密码：");
            String loginPwd = scan.next();
            String sql = "select * from student where studentName=? and loginPwd=?";
            //4.获取执行sql的对象
            ps = con.prepareStatement(sql);
            ps.setString(1,studentName);
            ps.setString(2,loginPwd);
            //5.执行sql
            System.out.println(sql);
            rs = ps.executeQuery();
            //6.处理返回结果 把取到的数据 封装到集合里
            User u = null;
            if(rs.next()){
                u = new User(rs.getInt("id"),rs.getString("username"),rs.getInt("age"),rs.getString("address"));
            }

            if(u == null){
                System.out.println("用户名或密码错误");
            }else{
                System.out.println("登录成功");
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                //7.释放资源
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(con != null) con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
