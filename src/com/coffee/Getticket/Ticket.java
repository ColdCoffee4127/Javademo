package com.coffee.Getticket;

/**
 * @ClassName Ticket
 * @description:
 * @author: coldcoffee
 * @create: 2024-04-29 17:28
 * @Version 1.0
 **/
public class Ticket {
    public static void main(String[] args) {
        TicketThread site = new TicketThread();
        Thread thread1 = new Thread(site,"张三");
        Thread thread2 = new Thread(site,"李四");
        Thread thread3 = new Thread(site,"王五");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
