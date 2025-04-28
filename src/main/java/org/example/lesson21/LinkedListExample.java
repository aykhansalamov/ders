package org.example.lesson21;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>(); // {Alma} - {Armud} - {Heyva}

        fruits.add("Alma");
        fruits.add("Armud");
        fruits.add("Heyva");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Ilk element: " + fruits.getFirst());
      //  fruits.removeFirst(); // ilk elementi sil
       // fruits.removeLast();  // son elementi sil

        for (String fruit : fruits) {
            System.out.println(fruit); // Alma
            fruits.removeFirst(); // Alma
            fruits.removeLast();  // Heyva
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
