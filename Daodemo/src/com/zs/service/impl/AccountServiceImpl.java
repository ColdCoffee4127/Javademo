package com.zs.service.impl;

import com.zs.dao.Accountdao;
import com.zs.dao.impl.AccountDaoImpl;
import com.zs.service.AccountService;
import com.zs.util.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ClassName AccountServiceImpl
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-03 15:50
 * @Version 1.0
 **/
public class AccountServiceImpl implements AccountService {
    @Override
    public boolean transfer(String from, String to, int money) {
        AccountDaoImpl adi = new AccountDaoImpl();
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
            con.setAutoCommit(false);
            adi.addMoney(to,money,con);
            adi.subMoneys(from,money,con);
            con.commit();
        } catch (Exception e) {
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }finally {
            JdbcUtils.release(con);
        }
        return false;
    }
}
