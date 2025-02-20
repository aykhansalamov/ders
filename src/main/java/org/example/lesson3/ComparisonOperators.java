package org.example.lesson3;

public class ComparisonOperators {
//    ==
//    !=
//    >
//    <
//    >=
//    <=
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println(x == y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x != y);
        System.out.println("Example method");
        example();
    }

    public static void example(){
        int x = 10;
        int y = x;
        System.out.println(x == y);
        System.out.println(y);
    }
}
