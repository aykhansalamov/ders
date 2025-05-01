package org.example.lesson23;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 1};
 //                      3, 3, 1
//                       3, 5, 1
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length-i-1; j++) {
                //     5       >    3
                if (numbers[j] > numbers[j+1]) {
                //      temp =     5
                    int temp = numbers[j];
      //            numbers[0] =   3
                    numbers[j] = numbers[j+1];
       //           numbers[1]   = 5;
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
