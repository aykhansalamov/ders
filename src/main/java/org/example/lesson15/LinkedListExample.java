package org.example.lesson15;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<String> cars = new LinkedList<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("VW");

        System.out.println("LinkedList: " + cars);
        System.out.println("First: " + cars.getFirst());
        System.out.println("Last: " + cars.getLast());
        cars.remove("Mercedes");
        System.out.println("LinkedList: " + cars);
        cars.addFirst("Mercedes");
        System.out.println("LinkedList: " + cars);
        cars.addLast("Toyota");
        System.out.println("LinkedList: " + cars);
    }
}
