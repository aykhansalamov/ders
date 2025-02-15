package org.example.lesson2;

import org.w3c.dom.ls.LSOutput;

public class PrimitiveDataTypes {
    public static void primitives() {

        byte smallNumber = 100;
        short shortNumber = 10000;
        int wholeNumber = 500000;
        long largeNumber = 10000000L;

        float floatNumber = 3.14f;
        double doubleNumber = 3.14;

        char letter = 'A';
        boolean isValid = true;

        System.out.println("Byte " + smallNumber);
        System.out.println("Short " + shortNumber);
        System.out.println("Integer " + wholeNumber);
        System.out.println("Long " + largeNumber);
        System.out.println("Float " + floatNumber);
        System.out.println("Double " + doubleNumber);
        System.out.println("Letter " + letter);
        System.out.println("isValid " + isValid);
    }

    public static void nonPrimitives() {

        String s = "Hello World";

        System.out.println( "String " + s);
    }
}
