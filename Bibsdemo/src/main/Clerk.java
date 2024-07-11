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
            System.out.println("====================��ӭ�㣺Ӫҵ��ְԱ====================");
            System.out.println("1.���� 2.��ѯ�˻���Ϣ 3.�޸��˻���Ϣ 4������������� 5.��ѯ�������� 6.ͳ�ƴ������� 7.�������˵�");
            System.out.print("��ѡ��");

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
                        System.out.println("���˻�������");
                    }else
                        System.out.println(account);
                    break;
                case 3:
                    QueryAcc qacc1 = new QueryAcc();
                    account = qacc1.queryAcc();
                    if(account == null){
                        System.out.println("���˻�������");
                    }else{
                        System.out.println("�˻���ǰ��Ϣ���£�" + account);
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
