package main;

import com.coffee.pojo.User;
import com.coffee.use.InsertUser;
import com.coffee.use.QueryUser;
import com.coffee.use.UpdateUser;

import java.util.Scanner;

/**
 * @ClassName Root
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 13:46
 * @Version 1.0
 **/
public class Root {

    public static void root(){
        Scanner x = new Scanner(System.in);
        while(true){
            System.out.println("====================��ӭ�㣺ϵͳ����Ա====================");
            System.out.println("1.������ɫ 2.��ѯ��ɫ 3.�޸Ľ�ɫ 4.�������˵�");
            System.out.print("��ѡ��");

            int y = x.nextInt();

            switch (y){
                case 1:
                    InsertUser inuser = new InsertUser();
                    inuser.insertUser();
                    break;
                case 2:
                    QueryUser quser = new QueryUser();
                    User user = quser.queryuser();
                    if (user != null)
                        System.out.println(user);
                    else
                        System.out.println("���û�������");
                    break;
                case 3:
                    QueryUser quser1 = new QueryUser();
                    user = quser1.queryuser();
                    if (user != null){
                        System.out.println("�û���ǰ��Ϣ���£�" + user);
                        UpdateUser upUser = new UpdateUser();
                        upUser.update();
                    }
                    else
                        System.out.println("���û�������");
                    break;
                case 4:
                    return ;
            }
        }
    }
}
