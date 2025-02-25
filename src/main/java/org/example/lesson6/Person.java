package org.example.lesson6;

public class Person {
//    String name;
//
//    void setName(String name) {
//        this.name = name;
//    }
//
//    void display() {
//        System.out.println(name + " is displaying.");
//    }

    Car getCar(int year) {
        Car car = new Car();
        car.brand = "BMW";
        car.color = "red";
        car.speed = 280;
        car.year = year; //2020
        return car;
    }
}

class Running {
    public static void main(String[] args) {
        Person p = new Person();
//        p.setName("Ayxan");
//        p.display();
        p.getCar(2020);
        Car car2 = new Car();
        car2 = p.getCar(2020);
        System.out.println(car2.color);
    }


}
