package org.example.lesson3;

public class TernaryOperator {

    // variable = (condition) ? valueIfTrue : valueIfFalse

    public static void main(String[] args) {
        int num = 10;
        String result = (num % 2 == 0) ? "Dogrudur" : "Sehvdir";
        System.out.println(result);

        String result2 = (num % 2 != 0) ? "True" : "False";
        System.out.println(result2);
    }
}
