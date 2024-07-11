package com.coffee.use;

import com.coffee.service.impl.BibsServiceImpl;

import java.util.Scanner;

/**
 * @ClassName Login
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 10:07
 * @Version 1.0
 **/
public class Loginuser {
    public String login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("«Î ‰»Î£∫userName");
        String userName = scan.next();
        System.out.println("«Î ‰»Î£∫password");
        String password = scan.next();
        BibsServiceImpl bsi = new BibsServiceImpl();
        return bsi.Login(userName,password);
    }
}
