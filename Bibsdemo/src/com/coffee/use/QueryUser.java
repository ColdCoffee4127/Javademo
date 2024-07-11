package com.coffee.use;

import com.coffee.pojo.Account;
import com.coffee.pojo.User;
import com.coffee.service.impl.BibsServiceImpl;

import java.util.Scanner;

/**
 * @ClassName QueryUser
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 10:10
 * @Version 1.0
 **/
public class QueryUser {

    public User queryuser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("«Î ‰»Î£∫userName");
        String userName = scan.next();
        BibsServiceImpl bsi = new BibsServiceImpl();
        return bsi.QueryUser(userName);
    }
}
