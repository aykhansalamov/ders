package org.example.lesson3;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not a valid number");
        }

//        char grade = 'B';
//
//        switch (grade) {
//            case 'A':
//                System.out.println("Excellent");
//                break;
//            case 'B':
//                System.out.println("Good");
//                break;
//            case 'C':
//                System.out.println("Average");
//                break;
//            default:
//                System.out.println("Unknown");
//        }

//        int day = 3;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }

    }
}
