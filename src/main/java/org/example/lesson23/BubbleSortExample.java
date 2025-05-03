package org.example.lesson23;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 1};
        //               3, 1, 5
        //               1, 3, 5
 //    indeks   0 < 1
  //   eded     5 > 3                   temp=5
  //            3 = 3
  //            3   5
//                       3, 5, 1
        //               3, 1, 5
        //               1, 3, 5
        //
        //      {0, 1, 2, 3, 4, 5, 6}  7
        //      {7, 3, 2, 5, 9, 6, 0}
        //          7  7  7  6  9  9
        //      {0, 2, 3, 5, 6, 7, 9}

        for (int i = 0; i < numbers.length-1; i++) {  // indeks sayi qeder tekrar et  //  36 -> 25 //

            for (int j = 0; j < numbers.length-i-1; j++) {  // 0-la 1-i muqayise et, 1-le 2-ni muqayise et, 2 ile 3-w muqayise et ....
                //     5       >    3
                if (numbers[j] > numbers[j+1]) {  // sol sagdan boyukdurse yerlerini yeshis
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
