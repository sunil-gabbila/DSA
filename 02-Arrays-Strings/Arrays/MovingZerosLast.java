package com.kodenest.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MovingZerosLast {

    public static void main(String[] args) {

        // Create Scanner object to get input from the user
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();

        // Create an array of size n
        int[] arr = new int[n];

        // Read array elements from the user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the method to move all zeros to the end
        int[] res = movingZerosToEnd(n, arr);

        // Print the modified array
        System.out.println(Arrays.toString(res));

        // Close Scanner
        sc.close();
    }

    public static int[] movingZerosToEnd(int n, int[] arr) {

        // write represents the position where the next non-zero
        // element should be placed
        int write = 0;

        // Traverse the entire array
        for (int i = 0; i < n; i++) {

            // Check whether the current element is non-zero
            if (arr[i] != 0) {

                // Place the non-zero element at the write position
                arr[write] = arr[i];

                // Move write to the next position
                write++;
            }
        }

        // Fill all remaining positions with zeros
        while (write < n) {

            arr[write] = 0;

            // Move to the next position
            write++;
        }

        // Return the modified array
        return arr;
    }
}
