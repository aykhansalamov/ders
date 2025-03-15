package org.example.lesson11.polymorphism;

public class Orxan extends Insan {

    public void uzmek(String deniz) {
        System.out.println("Orxan " + deniz + "-de uzur.");
    }

    public void kodYazmaq(String notebook) {
        System.out.println("Orxan " + notebook + "-da kod yazir.");
    }

    public void yemekBishirmek(String erzaq) {
        System.out.println("Orxan " + erzaq + "-la yemek bishirir.");
    }

    public void yemek(String su, String meyve) {
        System.out.println("Orxan " + su + ", " + meyve + " ile qidalanir");
    }

    @Override
    public void nefesAlmaq(String hava) {
        System.out.println("Orxan: " + hava + " ile" + " chetin nefes alir");
    }

}
