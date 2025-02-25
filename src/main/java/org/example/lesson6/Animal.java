package org.example.lesson6;

public class Animal {

    Dog newDog (String name) {
        Dog dog1 = new Dog();
        dog1.name = name;
        dog1.age = 1;
        dog1.type = "poodle";
        return dog1; // geri qaytar

    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.newDog("Doberman");

    }

}
