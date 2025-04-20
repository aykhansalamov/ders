package org.example.lesson20;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // dd-day, MM-month, yyyy-year
        String formattedDate = formatter.format(today);
        System.out.println("Formatlanmish tarix: " + formattedDate);

        LocalTime todayTime = LocalTime.now();
        System.out.println("Cari vaxt: " + todayTime);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm"); // HH-hour, mm-minute
        System.out.println("Formatlanmish vaxt: " + timeFormatter.format(todayTime));

    }
}
