package com.zs.service;

import com.zs.pojo.Employee;

import java.util.List;

/**
 * @ClassName EmployeeService
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 16:56
 * @Version 1.0
 **/
public interface EmployeeService {
    List<Employee> selectAllEmps();

    Employee selectEmpById(int id);

    int deleteEmpById(int id);

    int updateEmp(Employee employee);

    int insertEmp(Employee employee);
}
