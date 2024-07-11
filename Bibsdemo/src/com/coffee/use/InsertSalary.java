package com.coffee.use;

import com.coffee.pojo.Salary;
import com.coffee.service.impl.BibsServiceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName accSalary
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-28 15:15
 * @Version 1.0
 **/
public class InsertSalary {
    public void insertSalary(){
        Scanner x = new Scanner(System.in);
        System.out.println("请输入代发用户id:");
        int id = x.nextInt();
        System.out.println("请输入compName:");
        String compName = x.next();
        System.out.println("请输入empName:");
        String empName = x.next();
        System.out.println("请输入salary:");
        double salary = x.nextDouble();
        Date date = new Date();
        System.out.println("请输入comAcc:");
        String comAcc = x.next();
        System.out.println("请输入emoAcc:");
        String emoAcc = x.next();
        System.out.println("请输入payMonth");
        String payMonth = x.next();
        System.out.println("请输入idCard:");
        String idCard = x.next();
        System.out.println("请输入desc:");
        String desc = x.next();
        System.out.println("请输入approve:");
        String approve = x.next();
        BibsServiceImpl bibs = new BibsServiceImpl();
        bibs.InsertSalary(id,compName,empName,salary,payMonth,comAcc,emoAcc,idCard,desc,approve);
    }

}
