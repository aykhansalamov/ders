package org.example.lesson11.inheritance;

public class Eldar extends Insan{

    public void uzmek (String deniz) {
        System.out.println("Eldar " + deniz + "-de uzur.");
    }

    public void kodYazmaq (String notebook) {
        System.out.println("Eldar " + notebook + "-da kod yazir.");
    }

    public void yemekBishirmek (String erzaq) {
        System.out.println("Eldar " + erzaq + "-la yemek bishirir.");
    }
}
