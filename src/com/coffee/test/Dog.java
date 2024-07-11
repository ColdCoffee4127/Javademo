package com.coffee.test;

/**
 * @ClassName Dog
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-27 20:02
 * @Version 1.0
 **/
public class Dog extends Pet{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.print();
    }

    @Override
    public void print() {
        System.out.println("¹·ÔÚ½Ð");
    }
}
