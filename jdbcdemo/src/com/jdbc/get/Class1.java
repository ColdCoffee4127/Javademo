package com.jdbc.get;

import com.jdbc.pojo.User;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Class1
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-21 21:20
 * @Version 1.0
 **/
public class Class1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/school";
            con = DriverManager.getConnection(url,"root","123456");
            String sql = "select * from student";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            List<User> users = new ArrayList<>();
            while(rs.next()){
                User u = new User(rs.getInt("studentNo"),rs.getString("studentName"),rs.getString("phone"),rs.getString("address"));
                users.add(u);
            }

            System.out.println(String.format("%-5s %-8s %-12s %-10s","学号","学生名","联系方式","地址"));
            for(User user : users){
                System.out.println(String.format("%-8d %-7s %-7s %-15s",user.getStudentNo(),user.getStudentName(),user.getPhone(),user.getAddress()));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(con != null) con.close();
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
