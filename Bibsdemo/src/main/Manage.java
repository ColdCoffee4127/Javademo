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
            System.out.println("====================��ӭ�㣺Ӫҵ������====================");
            System.out.println("1.������������ 2.��ѯ�������� 3.ͳ�ƴ������� 4.�������˵�");
            System.out.print("��ѡ��");

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
