package com.coffee.use;

import com.coffee.service.impl.BibsServiceImpl;

import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName UpdateAcc
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 10:11
 * @Version 1.0
 **/
public class UpdateAcc {
    public void updateAcc(String account1) {
        Scanner scan = new Scanner(System.in);
        System.out.println("«Î ‰»Î£∫account");
        String account = scan.next();

        System.out.println("«Î ‰»Î£∫custName");
        String custName = scan.next();

        System.out.println("«Î ‰»Î£∫idCard");
        String idCard = scan.next();

        System.out.println("«Î ‰»Î£∫company");
        String company = scan.next();

        System.out.println("«Î ‰»Î£∫address");
        String address = scan.next();

        Date openTime = new Date();
        System.out.println("«Î ‰»Î£∫accState");
        String accState = scan.next();
        BibsServiceImpl bibs = new BibsServiceImpl();
        double balance = bibs.QueryAcc(account1).getBalance();
        BibsServiceImpl bsi = new BibsServiceImpl();
        bsi.UpdateAcc(account,custName,idCard,company,address, new java.sql.Date(openTime.getTime()),accState,balance);
    }
}
