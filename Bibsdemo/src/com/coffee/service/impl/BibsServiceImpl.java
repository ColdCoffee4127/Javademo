package com.coffee.service.impl;

import com.coffee.dao.impl.BibsDaoImpl;
import com.coffee.pojo.Account;
import com.coffee.pojo.User;
import com.coffee.service.BibsService;
import com.coffee.util.JdbcUtils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName BibsServiceImpl
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 11:42
 * @Version 1.0
 **/
public class BibsServiceImpl implements BibsService {
    @Override
    public int InsertAcc(String account, String custName, String idCard, String company, String address, Date openTime, String accState, double balance) {
        BibsDaoImpl bdi = new BibsDaoImpl();
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
            con.setAutoCommit(false);
            bdi.InsertAcc(account, custName, idCard, company, address, openTime, accState, balance, con);
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
        } finally {
            JdbcUtils.release(con);
        }
        return 0;
    }

    @Override
    public int InsertUser(String userName, String realName, String password, String userRole) {
        BibsDaoImpl bdi = new BibsDaoImpl();
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
            con.setAutoCommit(false);
            bdi.InsertUser(userName,realName,password, userRole,con);
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
        } finally {
            JdbcUtils.release(con);
        }
        return 0;
    }

    @Override
    public String Login(String userName, String password) {
        BibsDaoImpl bdi = new BibsDaoImpl();
        Connection con = null;
        String userRole = null;
        try {
            con = JdbcUtils.getConnection();
            con.setAutoCommit(false);
            User user = bdi.QueryUser(userName,con);
            if(password.equals(user.getPassword())){
                userRole = bdi.Login(userName,password,con);
            }else{
                System.out.println("用户名或密码错误！");
                return null;
            }
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
        } finally {
            JdbcUtils.release(con);
        }
        return userRole;
    }

    @Override
    public Account QueryAcc(String account) {
        BibsDaoImpl bdi = new BibsDaoImpl();
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
            Account acc = null;
            acc = bdi.QueryAcc(account,con);
            return acc;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtils.release(con);
        }
    }

    @Override
    public User QueryUser(String userName) {
        BibsDaoImpl bdi = new BibsDaoImpl();
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
            User user = null;
            user = bdi.QueryUser(userName,con);
            return user;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtils.release(con);
        }
    }

    @Override
    public int Register(String userName, String password, String realName) {
        BibsDaoImpl bdi = new BibsDaoImpl();
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
            con.setAutoCommit(false);
            bdi.Register(userName,realName,password,con);
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
        } finally {
            JdbcUtils.release(con);
        }
        return 0;
    }

    @Override
    public int Transfer(String transoutAcc, double transAmount, String transinAcc, Date transTime, String desc) {
        BibsDaoImpl bdi = new BibsDaoImpl();
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
            con.setAutoCommit(false);
            bdi.Transfer(transoutAcc,transAmount,transinAcc,transTime,desc,con);
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
        } finally {
            JdbcUtils.release(con);
        }
        return 0;
    }

    @Override
    public int UpdateAcc(String account, String custName, String idCard, String company, String address, Date openTime, String accState, double balance) {
        BibsDaoImpl bdi = new BibsDaoImpl();
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
            con.setAutoCommit(false);
            bdi.UpdateAcc(account,custName,idCard,company,address,openTime,accState,balance,con);
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
        } finally {
            JdbcUtils.release(con);
        }
        return 0;
    }

    @Override
    public int UpdateUser(String userName, String realName, String password, String userRole) {
        BibsDaoImpl bdi = new BibsDaoImpl();
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
            con.setAutoCommit(false);
            bdi.UpdateUser(userName,realName,password,userRole,con);
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
        } finally {
            JdbcUtils.release(con);
        }
        return 0;    }

    @Override
    public int InsertSalary(int id, String compName, String empName, double salary, String payMonth, String comAcc, String empAcc, String idCard, String desc, String approve ) {
        BibsDaoImpl bdi = new BibsDaoImpl();
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
            con.setAutoCommit(false);
            bdi.InsertSalary( id, compName,  empName,  salary,  payMonth,  comAcc,  empAcc,  idCard,  desc,  approve,  con);
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
        } finally {
            JdbcUtils.release(con);
        }
        return 0;
    }

    @Override
    public List<String> Querytrans() {
        BibsDaoImpl bdi = new BibsDaoImpl();
        Connection con = null;
        List<String> list = null;
        try{
            con = JdbcUtils.getConnection();
            con.setAutoCommit(false);
            if(bdi.QueryTrans(con) == null){
                return null;
            }else{
                list = bdi.QueryTrans(con);
            }
        } catch (Exception e){
            try{
                if(con != null){
                    con.rollback();
                }
            }catch (SQLException ex){
                throw new RuntimeException(ex);
            }
        }finally {
            JdbcUtils.release(con);
        }
        return list;
    }
}
