package org.example.lesson17;

public class Blocks {

    //Statik blok

    static {
        System.out.println("static block");
    }

    // Instance Blok

    {
        System.out.println("instance block");
    }

    public Blocks() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("main metod ishe dushdu");

        Blocks blocks = new Blocks();  //Konstructor ve instance blok ishe dushecek
    }

}
