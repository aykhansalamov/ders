package org.example.lesson4;

//while (condition) {
//    code
//        }
public class WhileLoop {
    public static void main(String[] args) {

        int consumption = 200;
        int limit1 = 500;
        int limit2 = 1500;
        double price1 = 0.12;
        double price2 = 0.20;
        double price3 = 0.30;
        int addition = 400;

        while (consumption + addition > limit2) {

                double price = price3;
                consumption += addition;

                System.out.println(price);
                System.out.println(consumption);
                break;
            }
        while (consumption + addition > limit1 && consumption + addition < limit2) {
            double price = price2;
            consumption += addition;

            System.out.println(price);
            System.out.println(consumption);
           // break;
        }
        while (consumption + addition < limit1 ) {
            double price = price1;
            consumption += addition;

            System.out.println(price);
            System.out.println(consumption);
            break;
        }

  //      int i = 1;

//        while (i <= 5) {
//            System.out.println(i);
//          //  i++;
//        }

//        int limit = 20000;
//         int amount = 5000;
//         int counter = 12000;
//
//         while (counter + amount < limit) {
//             counter += amount;
//             System.out.println("Success");
//         }
    }
}
