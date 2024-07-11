package com.coffee.Threadtest;

/**
 * @ClassName Test
 * @description:
 * @author: coldcoffee
 * @create: 2024-04-29 15:28
 * @Version 1.0
 **/
public class Test{
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread1.start();
        thread2.start();
    }

}
