package org.example.lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        Human.name = "Java";
        Human.surname = "Oracle";

        Human h = new Human();

        h.age = 21;

        Human.feeding("kabab");

        h.activity("qachmaq");
    }
}
