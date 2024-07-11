package com.coffee.use;

import com.coffee.service.impl.BibsServiceImpl;

import java.util.Scanner;

/**
 * @ClassName UpdateUser
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 10:11
 * @Version 1.0
 **/
public class UpdateUser {
    public void update() {
        BibsServiceImpl bibs = new BibsServiceImpl();
        Scanner scan = new Scanner(System.in);
        System.out.println("«Î ‰»Î£∫userName");
        String userName = scan.next();

        String realName = bibs.QueryUser(userName).getRealName();

        System.out.println("«Î ‰»Î£∫password");
        String password = scan.next();

        System.out.println("«Î ‰»Î£∫userRole");
        String userRole = scan.next();
        BibsServiceImpl bsi = new BibsServiceImpl();
        bsi.UpdateUser(userName,realName,password,userRole);
    }
}
