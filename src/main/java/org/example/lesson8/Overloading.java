package org.example.lesson8;

public class Overloading {

    String transport (String qum) {

        return "Kamaz " + qum + " dashiyir" ;
    }

    String transport (String pencere, String qapi) {
        return "Kamaz " + pencere + " ve " + qapi +" dashiyir" ;
    }

    public static void main(String[] args) {

        Overloading o = new Overloading();

        String ilk = o.transport("qum");
        System.out.println(ilk);

        String iki = o.transport ("plastik pencere", "taxta qapi");
        System.out.println(iki);

    }
}
