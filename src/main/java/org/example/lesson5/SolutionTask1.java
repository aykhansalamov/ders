package org.example.lesson5;

import java.util.Scanner;

//TASK  - 1
//
//        - Həftənin hər günü üçün bir məşğuliyyət təyin edin.
//        - User-dən konsoldan həftənin gününün nömrəsini daxil etməyi istəyin.
//        - Hansı günün rəqəmini daxil etsə həftənin həmin gününün adını və təyin olunan məşğuliyyəti qaytarsın.
//        - Səhv daxil etmələr üçün error message qaytarmasını nəzərə alın.
//
public class SolutionTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Heftenin gununun nomresini daxil et: ");

        while (true) {

            if (scanner.hasNextInt()) {


                int day = scanner.nextInt();

                switch (day) {
                    case 1:
                        System.out.println("Bazar ertesi");
                        System.out.println("Qacmaq");
                        break;
                    case 2:
                        System.out.println("Cersenbe axsami");
                        System.out.println("Gezmek");
                        break;
                    case 3:
                        System.out.println("Cersenbe");
                        System.out.println("Musiqi dinlemek");
                        break;
                    case 4:
                        System.out.println("Cume axsami");
                        System.out.println("Yemek");
                        break;
                    case 5:
                        System.out.println("Cume");
                        System.out.println("Yatmaq");
                        break;
                    case 6:
                        System.out.println("Senbe");
                        System.out.println("Bazarliq");
                        break;
                    case 7:
                        System.out.println("Bazar");
                        System.out.println("Dincelmek");
                        break;
                    default:
                        System.out.println("Dogru gun daxil edilmeyib");
                        break;
                }
            } else {
                System.out.println("Dogru yazi daxil edin");
                break;

        }
    }
}
}
