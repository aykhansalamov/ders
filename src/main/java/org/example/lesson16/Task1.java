package org.example.lesson16;

import java.util.LinkedList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Adil");
        person.setSurname("Memmedov");
        person.setAge("18");

        List<String> human1 = new LinkedList<>();

        human1.add(person.getName());
        human1.add(person.getSurname());
        human1.add(person.getAge());

     //   System.out.println(human1);


        List<String> human2 = new LinkedList<>();

        human2.add("Qalib");
        human2.add("Eliyev");
        human2.add("35");

        List<List<String>> human3 = new LinkedList<>();
        human3.add(0, human1);
        human3.add(1, human2);

       System.out.println(human3);

        System.out.println(human3.get(1).get(2));
    }
}
