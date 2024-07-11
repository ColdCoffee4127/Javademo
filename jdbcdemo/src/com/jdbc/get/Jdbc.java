package com.jdbc.get;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName Jdbc
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-20 15:10
 * @Version 1.0
 **/
public class Jdbc {
    public static void main(String[] args) {
        Connection con = null;
        Statement statement = null;
        try{
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/test";
            con = DriverManager.getConnection(url,"root","123456");
            //3.定义sql语句
            String sql = "update users set username='李四1' where id = 3";
            //4.获取执行sql的对象
            statement = con.createStatement();
            //5.执行sql
            int count = statement.executeUpdate(sql);
            //6.处理返回结果
            System.out.println(count > 0 ? "执行成功" : "失败");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                //7.释放资源
                if(statement != null) statement.close();
                if(con != null) con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
