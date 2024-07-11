package com.coffee.qimo;

/**
 * @ClassName Triangle
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-17 16:48
 * @Version 1.0
 **/
public class Triangle {
    private double a;
    private double b;
    private double c;
    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area(){
        double p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(s);
    }
    public double perimeter(){
        return a + b + c;
    }
}
