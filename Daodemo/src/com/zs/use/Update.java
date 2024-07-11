package com.zs.use;

import com.zs.dao.impl.EmployeeDaoimpl;
import com.zs.pojo.Employee;

import java.util.Scanner;

/**
 * @ClassName Update
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 17:30
 * @Version 1.0
 **/
public class Update {
    public static void main(String[] args) {
        EmployeeDaoimpl employee = new EmployeeDaoimpl();
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        String name = scan.next();
        String gender = scan.next();
        double salary = scan.nextDouble();
        if(employee.selectEmpById(id) != null){
            Employee e = new Employee();
            e.setId(id);
            e.setName(name);
            e.setGender(gender);
            e.setSalary(salary);
            employee.updateEmp(e);
        }else{
            System.out.println("û�в�ѯ�����id����");
        }
    }
}
