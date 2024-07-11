package com.zs.use;

import com.sun.javaws.IconUtil;
import com.zs.dao.impl.EmployeeDaoimpl;

import java.util.Scanner;

/**
 * @ClassName Seleby
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 17:30
 * @Version 1.0
 **/
public class Seleby {
    public static void main(String[] args) {
        EmployeeDaoimpl employee = new EmployeeDaoimpl();
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        if(employee.selectEmpById(id) != null){
            System.out.println(employee.selectEmpById(id));
        }else{
            System.out.println("没有查询到这个id的人");
        }
    }
}
