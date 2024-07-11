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
            System.out.println("=======================��ӭʹ�������м�ҵ��ϵͳ====");
            System.out.println("1.��¼ 2.ע�� 3.ת�� 4.�˳�");
            System.out.print("��ѡ��");
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
                        System.out.println("û���˻����ڣ�");
                    }else{
                        System.out.println("��ǰ�˻���Ϣ���£�");
                        System.out.println(list);
                        if(list.size() == 1){
                            System.out.println("������һ���û� �޷�ת��");
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
