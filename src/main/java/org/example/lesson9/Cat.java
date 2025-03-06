package org.example.lesson9;

public class Cat extends Animal {

    void meowing() {
        System.out.println(name + " miyoldayir");
    }

    @Override
    void voice() {
        System.out.println("miyoldayir");
    }
}
