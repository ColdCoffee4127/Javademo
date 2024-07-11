package com.zs.use;

import com.zs.dao.impl.EmployeeDaoimpl;
import com.zs.pojo.Employee;
import com.zs.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

/**
 * @ClassName Serupdate
 * @description:
 * @author: coldcoffee
 * @create: 2024-05-27 17:42
 * @Version 1.0
 **/
public class Serupdate {
    public static void main(String[] args) {
        EmployeeServiceImpl employee = new EmployeeServiceImpl();
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        String name = scan.next();
        String gender = scan.next();
        double salary = scan.nextDouble();
        if(employee.selectEmpById(id) != null){
            System.out.print("�������id��ȷ�ϸ���������y��");
            String ch = scan.next();
            if(ch.equals("y")){
                Employee e = new Employee();
                e.setId(id);
                e.setName(name);
                e.setGender(gender);
                e.setSalary(salary);
                employee.updateEmp(e);
                System.out.println("���³ɹ���");
            }else{
                System.out.println("ȡ������");
            }
        }else{
            System.out.println("û�в�ѯ�����id����");
        }
    }
}
