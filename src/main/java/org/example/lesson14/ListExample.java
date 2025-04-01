package org.example.lesson14;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Bob");
        names.add("John");
        names.add("Jack");
        names.add("Jane");

        System.out.println(names); // names adli listi chap et
        System.out.println(names.get(2)); // sifirinci indexdeki elementi chap et
        System.out.println(names.getFirst()); // getFirst birinci elementi chagirir
        System.out.println(names.getLast());  // getLast sonuncu elementi chagirir
        System.out.println(names.size()); // listin olchusunu qaytarir (element sayi)

        List<String> cities = new ArrayList<>();
        cities.add("Moscow");
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");

        List<List<String>> objects = new ArrayList<>();
        objects.add(names);
        objects.add(cities);
    }
}
