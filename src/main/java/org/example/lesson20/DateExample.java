package org.example.lesson20;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

public class DateExample {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();// now - indi
        System.out.println("Bu gunki tarix: " + today);

        LocalDate birthday = LocalDate.of(2019, 9, 20);
        System.out.println("Dogum tarixi: " + birthday);
    }
}
