package com.coffee.qimo;

/**
 * @ClassName TestTri
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-17 16:48
 * @Version 1.0
 **/
public class TestTri {
    public static void main(String[] args){
        double a = 3;
        double b = 4;
        double c = 5;
        Triangle tri = new Triangle(a,b,c);
        System.out.println(tri.area());
        System.out.println(tri.perimeter());

    }
}
