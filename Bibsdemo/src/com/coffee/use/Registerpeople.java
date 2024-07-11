package com.coffee.use;

import com.coffee.service.impl.BibsServiceImpl;

import java.util.Scanner;

/**
 * @ClassName Registerpeople
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-28 10:49
 * @Version 1.0
 **/
public class Registerpeople {
    public void register() {
        Scanner scan = new Scanner(System.in);
        System.out.println("«Î ‰»Î£∫userName");
        String userName = scan.next();

        System.out.println("«Î ‰»Î£∫realName");
        String realName = scan.next();

        System.out.println("«Î ‰»Îpassword£∫");
        String password = scan.next();

        BibsServiceImpl bsi = new BibsServiceImpl();
        bsi.Register(userName,password,realName);
    }
}
