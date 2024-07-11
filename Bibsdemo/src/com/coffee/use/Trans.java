package com.coffee.use;

import com.coffee.service.impl.BibsServiceImpl;

import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName Transfer
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 10:12
 * @Version 1.0
 **/
public class Trans {
    public void transfer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("«Î ‰»Î£∫transoutAcc");
        String transoutAcc = scan.next();

        double transAmount = scan.nextDouble();
        System.out.println("«Î ‰»Î£∫transinAcc");
        String transinAcc = scan.next();

        Date transTime = new Date();
        System.out.println("«Î ‰»Î£∫desc");
        String desc = scan.next();

        BibsServiceImpl bsi = new BibsServiceImpl();
        bsi.Transfer(transoutAcc,transAmount,transinAcc, new java.sql.Date(transTime.getTime()),desc);
    }
}
