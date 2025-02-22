package org.example.lesson3;

import java.util.Scanner;

public class ScannerUtil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yashinizi bilmek uchun tevelludunuzu daxil edin: ");

        int number = scanner.nextInt(); // 2000

        int age = 2025 - number; //  2025-2000 = 25

        System.out.println("Sizin yashiniz: " + age);

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Fikrinizi bildirin: ");

        String opinion = scanner1.nextLine();

        System.out.println("Sizin fikriniz beledir: " + opinion);

    }
}
