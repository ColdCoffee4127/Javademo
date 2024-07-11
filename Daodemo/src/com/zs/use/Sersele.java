package com.zs.use;

import com.zs.dao.impl.EmployeeDaoimpl;
import com.zs.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

/**
 * @ClassName Sersele
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 17:42
 * @Version 1.0
 **/
public class Sersele {
    public static void main(String[] args) {
        EmployeeServiceImpl employee = new EmployeeServiceImpl();
        System.out.print(employee.selectAllEmps());
    }
}
