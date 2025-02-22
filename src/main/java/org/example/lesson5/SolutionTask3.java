package org.example.lesson5;

import java.util.Scanner;

//TASK - 3
//
//        - Kalkulyator proqramı yazın.
//        - User daxil edəcəyi ədədlər üzərində toplama, çıxma, vurma, bölmə əməliyyatlarını yerinə yetirsin

public class SolutionTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk ədədi daxil edin: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Xəta: Rəqəm daxil edilməlidir!");
            return;
        }
        int number1 = scanner.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Xəta: Rəqəm daxil edilməlidir!");
            return;
        }
        int number2 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Əməliyyatı daxil edin (+, -, *, /): ");
        String operation = scanner.nextLine();

        if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
            System.out.println("Xəta: Düzgün əməliyyat daxil edilməlidir!");
            return;
        }

        switch (operation) {
            case "+":
                System.out.println("Nəticə: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Nəticə: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Nəticə: " + (number1 * number2));
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Xəta: Sıfıra bölmək mümkün deyil!");
                } else {
                    System.out.println("Nəticə: " + ((double) number1 / number2));
                }
                break;
        }
        scanner.close();
    }
}
