package com.coffee.use;

import com.coffee.service.impl.BibsServiceImpl;

import java.sql.Connection;
import java.sql.Date;
import java.util.Scanner;

/**
 * @ClassName InsertUser
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 10:10
 * @Version 1.0
 **/
public class InsertUser {
    public void insertUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入：userName");
        String userName = scan.next();

        System.out.println("请输入：realName");
        String realName = scan.next();

        System.out.println("请输入：password");
        String password = scan.next();

        System.out.println("请输入：userRole");
        String userRole = scan.next();
        BibsServiceImpl bsi = new BibsServiceImpl();
        if(bsi.QueryUser(userName) != null){
            System.out.println("用户已经存在");
        }else
            bsi.InsertUser(userName,realName,password,userRole);
    }
}
