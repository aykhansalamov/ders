package org.example.lesson22;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("a");
        queue.add("b");
        queue.add("c");

        System.out.println("Kyu-da birinci: " + queue.peek()); // a
        System.out.println("Kyu-da silir: " + queue.poll()); // a
        System.out.println("Kyu-da birinci: " + queue.peek()); // b
    }
}
