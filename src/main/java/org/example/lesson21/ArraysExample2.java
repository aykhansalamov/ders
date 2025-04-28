package org.example.lesson21;

public class ArraysExample2 {
    public static void main(String[] args) {

        int [] numbers = {3, 7, 2, 9, 5};

        int max = numbers[0]; //3, 7

        for (int i = 1; i < numbers.length; i++) { // 1, 2, 3, 4
        //       9  <    5
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Maksimum eded: " + max);
    }

    public static void sample1 () {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) { // (int i = 0; i < 5; i++)
            System.out.println("Element " + i + ": " + numbers[i]);
//            System.out.println("Element " + 0 + ": " + numbers[0]);
//            System.out.println("Element " + 1 + ": " + numbers[1]);
//            System.out.println("Element " + 2 + ": " + numbers[2]);
//            System.out.println("Element " + 3 + ": " + numbers[3]);
//            System.out.println("Element " + 4 + ": " + numbers[4]);
        }
    }
}
