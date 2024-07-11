package com.coffee.use;

import com.coffee.pojo.Account;
import com.coffee.service.impl.BibsServiceImpl;

import java.util.Scanner;

/**
 * @ClassName QueryAcc
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 10:09
 * @Version 1.0
 **/
public class QueryAcc {
    public Account queryAcc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("«Î ‰»Î£∫account");
        String account = scan.next();

        BibsServiceImpl bsi = new BibsServiceImpl();
        return bsi.QueryAcc(account);
    }
}
