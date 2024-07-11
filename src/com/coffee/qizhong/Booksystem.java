package com.coffee.qizhong;

import java.util.*;

/**
 * @ClassName Booksystem
 * @description:
 * @author: 202234070666lvangfei
 * @create: 2024-04-16 18:41
 * @Version 1.0
 **/
public class Booksystem {
    public static void main(String[] args) {
        HashMap<Integer,Book> bookmap = new HashMap<>();
        Scanner x = new Scanner(System.in);
        boolean flag = true;
        int num = 0;
        int b = 0;
        boolean search;
        System.out.println("----欢迎进入如数管理系统----");
        while(flag){
            System.out.println("1.添加图书");
            System.out.println("2.根据图书编号查询图书");
            System.out.println("3.根据图书编号删除图书");
            System.out.println("4.查询所有图书");
            System.out.println("5.退出系统");
            int a = x.nextInt();

            switch (a){
                case 1:
                    System.out.print("请输入图书名称：");
                    String name = x.next();
                    System.out.print("请输入图书作者：");
                    String author = x.next();
                    search = true;
                    for(int i = 1;i <= num;i ++){
                        Book bo = bookmap.get(i);
                        if (bo != null) {
                            String na = bo.getName();
                            String au = bo.getAuthor();
                            if(na.equals(name) && au.equals(author)){
                                search = false;
                            }
                        }
                    }

                    if(!search){
                        System.out.println("已有该图书,停止添加");
                    }else{
                        num ++;
                        Book book = new Book(num,name,author);
                        bookmap.put(num,book);
                    }
                    break;
                case 2:
                    if(bookmap.isEmpty()){
                        System.out.println("当前系统内没有图书");
                    }else{
                        search = true;
                        System.out.println("请输入查询编号：");
                        while(search){
                            b = x.nextInt();
                            if(b == 123456) break;
                            for(int i = 1;i <= num;i ++){
                                Book bo = bookmap.get(i);
                                if (bo != null && bo.getNum() == b) {
                                    search = false;
                                }
                            }
                            if(search){
                                System.out.println("没有这个编号的图书，请重新输入：(停止该操作请输入123456)");
                            }
                        }

                        if(b != 123456){
                            Book book1 = bookmap.get(b);
                            System.out.println("编号为"+b+"的图书"+"\n"+"书名是："+book1.getName()+"\n"+"作者是："+book1.getAuthor());

                        }
                    }
                break;
                case 3:
                    search = true;

                        if(bookmap.isEmpty()){
                            System.out.println("当前系统内没有图书");
                        }else {
                            System.out.println("请输入需要删除的图书编号：");
                            while (search) {
                                b = x.nextInt();
                                if(b == 123456) break;
                                for (int i = 1; i <= num; i++) {
                                    Book bo = bookmap.get(i);
                                    if (bo != null && bo.getNum() == b) {
                                        search = false;
                                    }
                                }
                                if (search) {
                                    System.out.println("没有这个编号的图书，请重新输入：(停止该操作请输入123456)");
                                }
                            }
                        }
                    
                    if(b != 123456){
                        bookmap.remove(b);
                        num --;
                        System.out.println("已成功删除！");
                    }
                break;
                case 4:
                    if(bookmap.isEmpty()){
                        System.out.println("没有图书");
                    }else{
                        Iterator<Map.Entry<Integer,Book>> it = bookmap.entrySet().iterator();
                        while(it.hasNext()){
                            Map.Entry<Integer,Book> entry = it.next();
                            Integer key = entry.getKey();
                            String boname = entry.getValue().getName();
                            String boauthor = entry.getValue().getAuthor();
                            System.out.println("编号为"+key+"的图书"+"\n"+"书名是："+boname+"\n"+"作者是："+boauthor);
                        }
                    }
                break;
                case 5:
                    flag = false;
                break;
            }
            System.out.println();
            if(!flag){
                System.out.println("欢迎下次使用！");
                break;
            }
        }

    }
}
