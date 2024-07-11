package com.jdbc.get;

import com.jdbc.pojo.User;
import com.jdbc.pojo.Grade;

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
public class Class2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/school";
            con = DriverManager.getConnection(url,"root","123456");
            String sql = "insert into grade values(?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1,11);
            pst.setString(2,"院士");
            int count = pst.executeUpdate();
            System.out.println(count > 0?"成功":"失败");
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(con != null) con.close();
                if(pst != null) pst.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
