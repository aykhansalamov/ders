package org.example.lesson9;

public class Dog extends Animal {

    void barking() {
        System.out.println(name + " hurur");
    }

    @Override
    void eat() {
        System.out.println(name + " yemek");
    }

    @Override
    void voice () {
        System.out.println("hurur");
    }



}
