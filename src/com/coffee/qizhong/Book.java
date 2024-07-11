package com.coffee.qizhong;

/**
 * @ClassName Book
 * @description:
 * @author: 202234070666lvangfei
 * @create: 2024-04-16 18:32
 * @Version 1.0
 **/
public class Book {
    private int num;
    private String name;
    private String author;

    public Book(){}

    public Book(int num,String name,String author){
        this.num = num;
        this.name = name;
        this.author = author;
    }



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
