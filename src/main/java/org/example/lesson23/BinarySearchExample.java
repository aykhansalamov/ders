package org.example.lesson23;

public class BinarySearchExample {
    public static void main(String[] args) {

        //           0, 1, 2, 3, 4
        int[] arr = {1, 3, 5, 7, 9}; // array 1, 3, 5, 7, 9

        //  hedef
        int target = 7; // 7-ni kolda tap (indeksini)

        //  sol  = 0.  sag  = ar. uzunluq - 1  (indeks nomresi)
        int left = 0, right = arr.length - 1; // 4

     // iken ( sol <= sag)
        while (left <= right) {

        //     orta =  (4    +  0)   / 2 = 2;
            int mid = (right + left) / 2;

        // eger(   5     =   7)
            if (arr[mid] == target) {

            //    cap et
                System.out.println("Tapildi: " + mid);
                System.out.printf("Eded ozu: " + arr[mid]);
                break;

        //   yox, eger ( 5      <    7  )
            } else if (arr[mid] < target) {

         //      sol = 2 + 1;
                left = mid + 1;

        //    yoxsa
            } else {

         //      sag  = sol - 1;
                right = mid - 1;
            }
        }
    }
}
