package org.example.lesson3;

public class IfElse {

    public static void main(String[] args) {

        int x = 10, y = 5;

//        if (x > y) {  //true
//            System.out.println("x > y");
//        }
        if (x < y) { //false
            System.out.println("x > y");
        } else if (x % y == 0) { //true
            System.out.println("X Y-e qaliqsiz bolunur");
        } else {
            System.out.println("Hech bir shert dugru deyil");
        }

//        if (x > y) {
//            System.out.println("x > y");
//           if (x % y == 0) {
//               System.out.println("X Y-e qaliqsiz bolunur");
//           } else {
//               System.out.println("Ikinci shert dogru deyil");
//           }
//        } else {
//            System.out.println("Hech bir shert dugru deyil");
//        }

//        int num = -5;
//        if (num > 0) {
//            System.out.println("Positive number");
//        } else {
//            System.out.println("Negative number");
//        }

//        int age = 18;
//        if (age >= 18) {
//            System.out.println("You can vote");
//        } else {
//            System.out.println("You cannot vote");
//        }

//        int a = 10, b = 20;
//        if (a > b) {
//            System.out.println(a + " > " + b);
//        } else {
//            System.out.println(a + " < " + b);
//        }

    }
}
