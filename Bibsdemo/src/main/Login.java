package main;

import com.coffee.use.Loginuser;

import java.util.Scanner;

import static main.Clerk.clerk;
import static main.Manage.manage;
import static main.Root.root;

/**
 * @ClassName Login
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 13:29
 * @Version 1.0
 **/
public class Login {
    public void loginin(){
        String y = null;
        while(y == null){
            Loginuser lo = new Loginuser();
            y = lo.login();
            switch (y){
                case "1":
                    root();
                    break;
                case "2":
                    clerk();
                    break;
                case "3":
                    manage();
                    break;
            }
        }
    }
}
