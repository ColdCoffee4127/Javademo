package com.coffee.Threadtest;

/**
 * @ClassName MyThread
 * @description:
 * @author: coldcoffee
 * @create: 2024-04-29 15:26
 * @Version 1.0
 **/
public class MyThread extends Thread{

    @Override
    public void run() {
        for(int i = 0;i < 5;i ++){
            System.out.println("你好，来自线程"+Thread.currentThread().getName()+":"+i);
        }
    }
}
