package com.zs.use;

import com.zs.dao.impl.EmployeeDaoimpl;
import com.zs.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

/**
 * @ClassName Serdele
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 17:42
 * @Version 1.0
 **/
public class Serdele {
    public static void main(String[] args) {
        EmployeeServiceImpl employee = new EmployeeServiceImpl();
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        if(employee.selectEmpById(id) != null){
            System.out.print("查询到相关信息，确认删除请输入y：");
            String ch = scan.next();
            if(ch.equals("y")){
                employee.deleteEmpById(id);
                System.out.println("删除成功！");
            }else{
                System.out.println("取消删除");
            }
        }else{
            System.out.println("该id不存在");
        }
    }
}
