package org.example.lesson18;

public class TryCatchWithFinally {

    public static void main(String[] args) {

//        int result = 10/0;
//        System.out.println(result);

        try {
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("0-a bolmek olmaz!");

        } finally {
            System.out.println("Bu blok her zaman ishleyecek");
        }
    }
}
