package com.jdbc.get;

import com.jdbc.pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Jdbc
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-20 15:10
 * @Version 1.0
 **/
public class Jdbcselect {
    public static void main(String[] args) {
        Connection con = null;
        Statement statement = null;
        ResultSet rs = null;
        try{
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/test";
            con = DriverManager.getConnection(url,"root","123456");
            //3.定义sql语句
            String sql = "select * from users";
            //4.获取执行sql的对象
            statement = con.createStatement();
            //5.执行sql
            rs = statement.executeQuery(sql);
            //6.处理返回结果 把取到的数据 封装到集合里
            List<User> users = new ArrayList<>();
            while(rs.next()){
                User u = new User(rs.getInt("id"),rs.getString("username"),rs.getInt("age"),rs.getString("address"));

                users.add(u);
            }

            System.out.println(String.format("%-6s %-9s %-8s %-8s","用户id","用户姓名","年龄","住址"));

            for(User user : users){
                System.out.println(String.format("%-7d %-11s %-9d %-11s",user.getId(),user.getName(),user.getAge(),user.getAddress()));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                //7.释放资源
                if(rs != null) rs.close();
                if(statement != null) statement.close();
                if(con != null) con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
