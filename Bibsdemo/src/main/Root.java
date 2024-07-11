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
            System.out.println("====================欢迎你：系统管理员====================");
            System.out.println("1.新增角色 2.查询角色 3.修改角色 4.返回主菜单");
            System.out.print("请选择：");

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
                        System.out.println("该用户不存在");
                    break;
                case 3:
                    QueryUser quser1 = new QueryUser();
                    user = quser1.queryuser();
                    if (user != null){
                        System.out.println("用户当前信息如下：" + user);
                        UpdateUser upUser = new UpdateUser();
                        upUser.update();
                    }
                    else
                        System.out.println("该用户不存在");
                    break;
                case 4:
                    return ;
            }
        }
    }
}
