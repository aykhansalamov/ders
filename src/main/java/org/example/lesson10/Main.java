package org.example.lesson10;

public class Main {


    public static void main(String[] args) {

        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}
