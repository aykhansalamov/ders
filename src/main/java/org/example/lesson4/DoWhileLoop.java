package org.example.lesson4;

// do {
//code
//         } while(condition);

public class DoWhileLoop {
    public static void main(String[] args) {

        int retryCount = 1;


        do {
            System.out.println("enter password");
            // kecdi
            retryCount++;
        } while (retryCount <= 3);

        while (retryCount <= 3) {
            System.out.println("enter password");
            //kecdi
            retryCount++;
        }


//        int i = 10;

//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 5);

//        while (i <= 5) {
//            System.out.println(i);
//            i++;
//        }
    }
}
