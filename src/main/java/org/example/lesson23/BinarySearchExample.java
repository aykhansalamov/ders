package org.example.lesson23;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 7;
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] == target) {
                System.out.println("Tapildi: " + mid);
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
