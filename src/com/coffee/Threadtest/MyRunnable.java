package com.coffee.Threadtest;

/**
 * @ClassName MyRunnable
 * @description:
 * @author: coldcoffee
 * @create: 2024-04-29 15:25
 * @Version 1.0
 **/
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i < 5;i ++){
            System.out.println("你好，来自线程"+Thread.currentThread().getName()+":"+i);
        }
    }
}
