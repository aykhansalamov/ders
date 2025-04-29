package org.example.lesson22;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println("En ustdeki element: " + stack.peek()); // c
        System.out.println("Silinen element: " + stack.pop()); // c
        System.out.println("En ustdeki element: " + stack.peek()); // b
    }
}
