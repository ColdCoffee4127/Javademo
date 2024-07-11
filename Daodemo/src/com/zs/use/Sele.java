package com.zs.use;

import com.zs.dao.Employeedao;
import com.zs.dao.impl.EmployeeDaoimpl;
import com.zs.pojo.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Sele
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 16:25
 * @Version 1.0
 **/
public class Sele {
    public static void main(String[] args) {
        EmployeeDaoimpl employee = new EmployeeDaoimpl();
        System.out.print(employee.selectAllEmps());
    }
}
