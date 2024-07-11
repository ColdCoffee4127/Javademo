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
        System.out.println("������account:");
        String account = x.next();
        System.out.println("������custName:");
        String custName = x.next();
        System.out.println("������idCard:");
        String idCard = x.next();
        System.out.println("������company:");
        String company = x.next();
        System.out.println("������address:");
        String address = x.next();
        System.out.println("������accState:");
        String accState = x.next();
        System.out.println("������balance:");
        double balance = x.nextDouble();
        BibsServiceImpl bsi = new BibsServiceImpl();
        Date date = new Date();
        if(bsi.QueryAcc(account) != null){
            System.out.println("�˻��Ѿ�����");
        }else
            bsi.InsertAcc(account,custName,idCard,company,address, new java.sql.Date(date.getTime()) ,accState,balance);
    }
}
