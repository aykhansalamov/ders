package org.example.lesson6;

public class UsingCar {
    public static void main(String[] args) {


        Car car1 = new Car(); // Obyekti yaratdiq
        car1.color = "blue";
        car1.brand = "Honda";
        car1.year = 2018;
        car1.speed = 240;

        car1.start();
        car1.stop();

        Car car2 = new Car();
        car2.color = "red";
        car2.brand = "BMW";
        car2.year = 2020;
        car2.speed = 280;

        car2.start();
        car2.stop();
    }
}