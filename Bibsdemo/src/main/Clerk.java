package main;

import com.coffee.pojo.Account;
import com.coffee.use.*;

import java.util.Scanner;

/**
 * @ClassName Clerk
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 13:46
 * @Version 1.0
 **/
public class Clerk {
    public static void clerk(){
        Scanner x = new Scanner(System.in);
        while(true){
            System.out.println("====================欢迎你：营业部职员====================");
            System.out.println("1.开户 2.查询账户信息 3.修改账户信息 4，导入代发工资 5.查询代发工资 6.统计代发工资 7.返回主菜单");
            System.out.print("请选择：");

            int y = x.nextInt();

            switch (y){
                case 1:
                    InsertAcc ia = new InsertAcc();
                    ia.insertAcc();
                    break;
                case 2:
                    QueryAcc qacc = new QueryAcc();
                    Account account = qacc.queryAcc();
                    if(account == null){
                        System.out.println("该账户不存在");
                    }else
                        System.out.println(account);
                    break;
                case 3:
                    QueryAcc qacc1 = new QueryAcc();
                    account = qacc1.queryAcc();
                    if(account == null){
                        System.out.println("该账户不存在");
                    }else{
                        System.out.println("账户当前信息如下：" + account);
                        UpdateAcc uacc = new UpdateAcc();
                        uacc.updateAcc(account.getAccount());
                    }
                    break;
                case 4:
                    InsertSalary salary = new InsertSalary();
                    salary.insertSalary();
                    break;
            }
        }
    }
}
