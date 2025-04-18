package org.example.lesson20;

import java.time.LocalDate;

public class PlusMinusExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Bu gun: " + today);
        System.out.println("2 gun evvel: " + today.minusDays(2));
        System.out.println("3 gun sonra: " + today.plusDays(3));
        System.out.println("1 hefte evvel: " + today.minusWeeks(1));
        System.out.println("7 hefte sonra: " + today.plusWeeks(7));
        System.out.println("1 ay sonra: " + today.plusMonths(1));

        LocalDate bitmeTarixi = today.plusYears(1);

        if (today.isAfter(bitmeTarixi)) {
            System.out.println("Sistemi durdur");
        }
    }
}
