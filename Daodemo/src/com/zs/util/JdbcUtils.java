package com.zs.util;

import jdk.nashorn.internal.runtime.ECMAException;

import java.sql.*;

/**
 * @ClassName JdbcUtils
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 15:31
 * @Version 1.0
 **/
public class JdbcUtils {
    private final static String URL = "jdbc:mysql://localhost:3306/employee";
    private final static String USER_NAME = "root";
    private final static String PASSWORD = "123456";
    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
    }

    public static void release(Statement st,Connection con){
        try{
            if(st!=null){
                st.close();
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        try{
            if(con!=null){
                con.close();
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static void release(Statement st, Connection con, ResultSet rs){
        try{
            if(rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        try{
            if(st!=null){
                st.close();
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        try{
            if(con!=null){
                con.close();
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void release(Connection con) {
        try{
            if(con!=null){
                con.close();
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void release(PreparedStatement ps) {
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
