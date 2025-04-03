package org.example.lesson15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> uniqueNames = new HashSet<>();

        uniqueNames.add("Ayxan");
        uniqueNames.add("Elvin");
        uniqueNames.add("Alex");
        uniqueNames.add("Bob");
        uniqueNames.add("Bobby");

        //  System.out.println(uniqueNames);

        Set<String> smartphones = new LinkedHashSet<>();

        smartphones.add("Iphone");
        smartphones.add("Sony");
        smartphones.add("Nokia");
        smartphones.add("Samsung");
        //  System.out.println(smartphones);


        Set<String> names = new TreeSet<>();
        names.add("Ayxan");
        names.add("Elvin");
        names.add("Alex");
        names.add("Bob");
        names.add("Bobby");
        names.add("Zaur");

        System.out.println(names);

        names.add("Natiq");
        names.add("Abbas");
        System.out.println(names);

    }
}