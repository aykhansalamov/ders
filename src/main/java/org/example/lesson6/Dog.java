package org.example.lesson6;

public class Dog {
    String name;
    int age;
    String type;

    void eat() {
        System.out.println("eating meals for " + age + " years.");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.eat();
    }

}
