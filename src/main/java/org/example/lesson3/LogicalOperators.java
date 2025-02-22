package org.example.lesson3;

public class LogicalOperators {
//    &&  = ve
//    ||  = ve ya
//    !  = deyil
//.   Sinifde 10 ushaq var. 3 oglan, 7 qiz.
//.   boolean a = (sinifde 3 oglan var) //true
//.   boolean b = (sinifde 3 qiz var) //false
    public static void main(String[] args) {
        boolean a = true; //+
        boolean b = false;//-

        System.out.println(a && b);  //false
        System.out.println(a || b);  //true
        System.out.println(!a); //false
    }
}
