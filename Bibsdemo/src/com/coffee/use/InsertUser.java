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
        System.out.println("�����룺userName");
        String userName = scan.next();

        System.out.println("�����룺realName");
        String realName = scan.next();

        System.out.println("�����룺password");
        String password = scan.next();

        System.out.println("�����룺userRole");
        String userRole = scan.next();
        BibsServiceImpl bsi = new BibsServiceImpl();
        if(bsi.QueryUser(userName) != null){
            System.out.println("�û��Ѿ�����");
        }else
            bsi.InsertUser(userName,realName,password,userRole);
    }
}
