package main;

import com.coffee.use.Querytrans;
import com.coffee.use.Registerpeople;
import com.coffee.use.Trans;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName test.BibsMain
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 11:45
 * @Version 1.0
 **/
public class BibsMain {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int c;
        boolean st = true;
        while (st) {
            System.out.println("=======================欢迎使用银行中间业务系统====");
            System.out.println("1.登录 2.注册 3.转账 4.退出");
            System.out.print("请选择：");
            c = x.nextInt();
            switch (c) {
                case 1:
                    Login login = new Login();
                    login.loginin();
                    break;
                case 2:
                    Registerpeople registerpeople = new Registerpeople();
                    registerpeople.register();
                    break;
                case 3:
                    Querytrans qtr = new Querytrans();
                    List<String> list = qtr.queryTrans();
                    if(list == null){
                        System.out.println("没有账户存在！");
                    }else{
                        System.out.println("当前账户信息如下：");
                        System.out.println(list);
                        if(list.size() == 1){
                            System.out.println("仅存在一个用户 无法转账");
                        }else{
                            Trans trans = new Trans();
                            trans.transfer();
                        }
                    }
                    break;
                case 4:
                    st = false;
                    break;
            }
        }
    }

}
