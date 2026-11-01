package com.kodenest.arrays;


import java.util.Scanner;

public class MoveNegativeEnd {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();

        // Create original array
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create result array
        int[] res = new int[n];

        // Position to insert non-negative elements
        int write = 0;

        // First traversal: Store zero and positive elements
        for (int i = 0; i < n; i++) {

            if (arr[i] >= 0) {

                res[write] = arr[i];

                // Move to the next available position
                write++;
            }
        }

        // Second traversal: Store negative elements
        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) {

                res[write] = arr[i];

                // Move to the next available position
                write++;
            }
        }

        // Print the rearranged array
        System.out.print("Reordered: ");

        for (int i : res) {
            System.out.print(i + " ");
        }

        // Close Scanner
        sc.close();
    }
}
