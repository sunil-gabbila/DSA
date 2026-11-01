package com.kodenest.arrays;

import java.util.Scanner;

public class Replacement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        // Call the method to update the array
        replaceNonPositive(arr, target);

        System.out.print("Updated: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    // Method to replace zero and negative elements
    public static void replaceNonPositive(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= 0) {
                arr[i] = target;
            }
        }
    }
}
