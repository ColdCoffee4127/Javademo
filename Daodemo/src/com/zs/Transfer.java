package com.zs;

import com.zs.util.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @ClassName Transfer
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-03 15:31
 * @Version 1.0
 **/
public class Transfer {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = JdbcUtils.getConnection();
            con.setAutoCommit(false);
            String sql1 = "update account set money = money - ? where name = ?";
            String sql2 = "update account set money = money + ? where name = ?";
            ps = con.prepareStatement(sql1);
            ps.setInt(1,100);
            ps.setString(2,"张三");
            ps.executeUpdate();
            ps = con.prepareStatement(sql2);
            ps.setInt(1,100);
            ps.setString(2,"李四");
            ps.executeUpdate();
            con.commit();
        } catch (Exception e) {
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
