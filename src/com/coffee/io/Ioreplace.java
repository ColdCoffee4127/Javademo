package com.coffee.io;

import java.io.*;
import java.util.Scanner;

/**
 * @ClassName Ioreplace
 * @description:
 * @author: coldcoffee
 * @create: 2024-04-22 17:06
 * @Version 1.0
 **/
public class Ioreplace {
    public static void main(String[] args) {
        Reader fr = null;
        BufferedReader br = null;
        Writer fw = null;
        BufferedWriter bw = null;
        Scanner x = new Scanner(System.in);

        try {
            fr = new FileReader("d:\\pet.template");
            br = new BufferedReader(fr);
            fw = new FileWriter("d:\\pet.txt");
            bw = new BufferedWriter(fw);

            StringBuffer sbf = new StringBuffer();

            String str = null;

            while((str=br.readLine()) != null){
                sbf.append(str);
            }
            System.out.println(sbf);
            String name,type,master;
            name = x.next();
            type = x.next();
            master = x.next();
            int l = 0,r = 0;
            boolean f1 = false,f2 = false,f3 = false;

            for (int i = 0; i < sbf.length(); i++) {
                char ch = sbf.charAt(i);
                if(ch == '{'){
                    l = i;
                }else if(ch == '}'){
                    r = i;
                    if(!f1 && !f2 && !f3){
                        sbf.replace(l,r + 1,name);
                        f1 = true;
                    }else if(f1 && !f2 && !f3){
                        sbf.replace(l,r + 1,type);
                        f2 = true;
                    }else{
                        sbf.replace(l,r + 1,master);
                        f3 = true;
                    }
                }
            }

            str = sbf.toString();

            System.out.println(sbf);

            bw.write(str);
            bw.flush();
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fr!=null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(br!=null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
