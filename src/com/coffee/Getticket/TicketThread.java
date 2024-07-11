package com.coffee.Getticket;

/**
 * @ClassName TicketThread
 * @description:
 * @author: coldcoffee
 * @create: 2024-04-29 17:28
 * @Version 1.0
 **/
public class TicketThread extends Thread{
    boolean flag = true;

    int num = 0;
    int count = 20;

    public synchronized void sale(){
        if(count <= 0){
            flag = true;
            return ;
        }
        num ++;
        count --;
        try{
            Thread.sleep(0);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"抢到了第"+num+"张票，剩余"+count+"张票!");
    }

    @Override
    public void run() {
        while(flag){
            sale();
        }
    }
}
