package com.zs.use;

import com.zs.dao.impl.EmployeeDaoimpl;

import java.util.Scanner;

/**
 * @ClassName Dele
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 16:25
 * @Version 1.0
 **/
public class Dele {
    public static void main(String[] args) {
        EmployeeDaoimpl employee = new EmployeeDaoimpl();
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        if(employee.selectEmpById(id) != null){
            employee.deleteEmpById(id);
            System.out.println("删除成功！");
        }else{
            System.out.println("该id不存在");
        }
    }
}
