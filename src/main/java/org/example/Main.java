package org.example;

import org.example.lesson1.ders.Ders1;
import org.example.lesson2.PrimitiveDataTypes;

public class Main {
    public static void main(String[] args) {

        int [] eded = new int[3];

        eded [0] = 5;
        eded [1] = 9;
        eded [2] = 8;

        int number = 0;
        int multiplier = 1;

        for(int indexOfArray = eded.length - 1; indexOfArray >= 0; indexOfArray--) {

           number +=  eded[indexOfArray] * multiplier;
           multiplier *= 10;
        }
        System.out.println(number);
    }
}