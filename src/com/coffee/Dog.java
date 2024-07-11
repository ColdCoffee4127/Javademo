package com.coffee;

/**
 * @ClassName Dog
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-17 16:44
 * @Version 1.0
 **/
public class Dog extends Animal implements Speakable{

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        dog.speak();
    }
    @Override
    public void speak() {
        System.out.println("dog is speaking");
    }

    @Override
    public void run() {
        System.out.println("dog is running");
    }
}
