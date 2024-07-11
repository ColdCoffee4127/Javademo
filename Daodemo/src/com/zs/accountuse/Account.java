package com.zs.accountuse;

import com.zs.dao.impl.AccountDaoImpl;
import com.zs.service.AccountService;
import com.zs.service.impl.AccountServiceImpl;
import com.zs.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

/**
 * @ClassName Account
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-03 16:02
 * @Version 1.0
 **/
public class Account {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String to,from;
        int money;
        to = x.next();
        from = x.next();
        money = x.nextInt();
        AccountService as = new AccountServiceImpl();
        as.transfer(from,to,money);
    }
}
