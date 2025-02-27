package org.example.lesson7;

//TASK - 4
//        - Person obyekti yaradın.
//- Bu obyektin class-ına field-lər və method-lar əlavə edin.
//- Field sayı 4 olsun.
//- Method-ların sayı 4 olsun:
//        1 - Request və response dolu olsun
//2 - Request dolu, response boş olsun
//3 - Request boş, response dolu olsun
//4 - Request və response boş olsun
//
//*Deadline: 27.02.2025 20:00
//        *Proyekti github-a əlavə edib linki mənə göndərin

public class Person {
    String name;
    String surname;
    int age;
    String gender;

    public String giveName(String name) {
        this.name = name;
        System.out.println("Log1: giveName metodu ishledi ve " + name + " parametrini ad kimi menimsedir ve qaytarir");
        return name;
    }

    public void giveSurname(String surname1) {
        surname = surname1;
        System.out.println("Log2: giveSurName metodu ishledi ve " + surname + " parametrini soyad kimi menimsedir");
    }

    public int getAge() {
        age = 20;
        System.out.println("Log3: getAge metodu ishledi ve " + age + " parametrini yash kimi menimsedir ve qaytarir");
        return age;
    }
    public void giveGender() {
        gender = "male";
        System.out.println("Log4: giveGender metodu ishledi ve " + gender + " parametrini cins kimi menimsedir");
    }

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.giveName("Java");
        person1.giveSurname("Oracle");
        person1.getAge();
        person1.giveGender();
    }
}
