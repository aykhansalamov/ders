package org.example.lesson5;

//TASK - 2
//
//        - User-dən konsoldan il daxil etməsini istəyin.
//        - Daxil edilən ildə fevral ayının 28 və ya 29 gündən ibarət olması barədə cavab qaytarın.
//          (User istənilən ili daxil edə bilər)
//        - Səhv daxil etmələr üçün error message qaytarmasını nəzərə alın.

import java.util.Scanner;

public class SolutionTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ili daxil edin: ");


        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();

            if (year > 0) {

                boolean result = (year % 4 == 0);

                if (result) {
                    System.out.println(year + " il fevral ayi 29 gunden ibaretdir");
                } else {
                    System.out.println(year + " il fevral ayi 28 gunden ibaretdir");
                }
            } else {
                System.out.println(year + " il sifirdan boyuk olmalidir");
            }
        } else {
            System.out.println("Dogru data daxil edin");
        }
    }
}
