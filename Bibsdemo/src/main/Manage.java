package main;

import java.util.Scanner;

/**
 * @ClassName Manage
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-15 13:47
 * @Version 1.0
 **/
public class Manage {
    public static void manage(){
        Scanner x = new Scanner(System.in);
        while(true){
            System.out.println("====================欢迎你：营业部经理====================");
            System.out.println("1.代发工资审批 2.查询代发工资 3.统计代发工资 4.返回主菜单");
            System.out.print("请选择：");

            int y = x.nextInt();

            switch (y){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return ;
            }
        }
    }
}
