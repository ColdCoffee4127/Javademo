package com.zs.dao.impl;

import com.zs.dao.Accountdao;
import com.zs.util.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @ClassName AccountDaoImpl
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-03 15:51
 * @Version 1.0
 **/
public class AccountDaoImpl implements Accountdao {

    @Override
    public int addMoney(String to, int money, Connection con) {
        PreparedStatement ps = null;
        String sql = "update account set money = money + ? where name = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,money);
            ps.setString(2,to);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }JdbcUtils.release(ps);
        return 0;
    }

    @Override
    public int subMoneys(String from, int money, Connection con) {
        PreparedStatement ps = null;
        String sql = "update account set money = money - ? where name = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,money);
            ps.setString(2,from);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtils.release(ps);
        }
        return 0;
    }
}
