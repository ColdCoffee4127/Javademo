package com.zs.dao.impl;

import com.zs.dao.Employeedao;
import com.zs.pojo.Employee;
import com.zs.util.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName EmployeeDaoimpl
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 15:33
 * @Version 1.0
 **/
public class EmployeeDaoimpl implements Employeedao {

    @Override
    public List<Employee> selectAllEmps() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            con = JdbcUtils.getConnection();
            String sql = "select * from employee";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Employee> emps = new ArrayList<>();
            while(rs.next()){
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setGender(rs.getString("gender"));
                emp.setSalary(rs.getDouble("salary"));
                emps.add(emp);
            }
            return emps;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            JdbcUtils.release(ps,con,rs);
        }
    }

    @Override
    public Employee selectEmpById(int id) {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            con = JdbcUtils.getConnection();
            String sql = "select * from employee where id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            Employee e = null;
            if(rs.next()){
                e = new Employee();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setGender(rs.getString("gender"));
                e.setSalary(rs.getDouble("salary"));
            }
            return e;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.release(ps,con,rs);
        }
        return null;
    }

    @Override
    public int deleteEmpById(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = JdbcUtils.getConnection();
            String sql = "delete from employee where id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            return ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            JdbcUtils.release(ps,con);
        }
    }


    @Override
    public int updateEmp(Employee employee) {
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = JdbcUtils.getConnection();
            String sql = "update employee set name = ? ,gender = ?, salary = ? where id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1,employee.getName());
            ps.setString(2,employee.getGender());
            ps.setDouble(3,employee.getSalary());
            ps.setInt(4,employee.getId());
            return ps.getUpdateCount();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.release(ps,con);
        }
        return 0;
    }

    @Override
    public int insertEmp(Employee employee) {
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = JdbcUtils.getConnection();
            String sql = "insert into employee values(?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1,employee.getId());
            ps.setString(2, employee.getName());
            ps.setString(3, employee.getGender());
            ps.setDouble(4,employee.getSalary());
            return ps.getUpdateCount();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.release(ps,con);
        }
        return 0;
    }


}
