package com.coffee.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName Iotest
 * @description:
 * @author: 202234070666lvangfei
 * @create: 2024-04-22 15:38
 * @Version 1.0
 **/
public class Iotest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream("d:\\try.jpg");
            fos = new FileOutputStream("d:\\success.jpg");
            byte[] bytes = new byte[1024];
            int len = 0;
                while((len=fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }

        }catch(Exception e){
            throw new RuntimeException(e);
        }finally{
            try{
                if(fos != null) fos.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                if(fis!=null) fis.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
