package com.zs.use;

import com.zs.dao.impl.EmployeeDaoimpl;
import com.zs.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

/**
 * @ClassName Serseleby
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 17:42
 * @Version 1.0
 **/
public class Serseleby {
    public static void main(String[] args) {
        EmployeeServiceImpl employee = new EmployeeServiceImpl();
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        if(employee.selectEmpById(id) != null){
            System.out.println(employee.selectEmpById(id));
        }else{
            System.out.println("没有查询到这个id的人");
        }
    }
}
