package com.zs.dao;

import com.zs.pojo.Employee;

import java.util.List;

/**
 * @ClassName Employeedao
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 14:53
 * @Version 1.0
 **/
public interface Employeedao {
    List<Employee> selectAllEmps();

    Employee selectEmpById(int id);

    int deleteEmpById(int id);

    int updateEmp(Employee employee);

    int insertEmp(Employee employee);
}
