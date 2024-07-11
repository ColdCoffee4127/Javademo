package com.coffee.use;

import com.coffee.service.impl.BibsServiceImpl;

import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName InsertAcc
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-28 13:43
 * @Version 1.0
 **/
public class InsertAcc {

    public void insertAcc() {
        Scanner x = new Scanner(System.in);
        System.out.println("请输入account:");
        String account = x.next();
        System.out.println("请输入custName:");
        String custName = x.next();
        System.out.println("请输入idCard:");
        String idCard = x.next();
        System.out.println("请输入company:");
        String company = x.next();
        System.out.println("请输入address:");
        String address = x.next();
        System.out.println("请输入accState:");
        String accState = x.next();
        System.out.println("请输入balance:");
        double balance = x.nextDouble();
        BibsServiceImpl bsi = new BibsServiceImpl();
        Date date = new Date();
        if(bsi.QueryAcc(account) != null){
            System.out.println("账户已经存在");
        }else
            bsi.InsertAcc(account,custName,idCard,company,address, new java.sql.Date(date.getTime()) ,accState,balance);
    }
}
