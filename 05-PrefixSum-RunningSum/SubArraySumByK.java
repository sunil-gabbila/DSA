
package com.kodnest.prefixhashset;

import java.util.Scanner;

public class SubArraySumByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Scanner object to read input from the user.
		Scanner sc = new Scanner(System.in);

		// Read the size of the array.
		int n = sc.nextInt();

		// Create an integer array of size n.
		int [] arr = new int[n];

		// Read n elements into the array.
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Read the target value.
		// We need to check whether a prefix sum is divisible by this target.
		int target = sc.nextInt();

		// Call the method and print YES if a qualifying prefix sum exists;
		// otherwise, print NO.
		System.out.println(sumDivisibleByTarget(n, arr, target));

		// Close the Scanner object.
		sc.close();

	}

	public static String sumDivisibleByTarget(int n, int [] arr, int target) {

		// Initialize the prefix sum to zero.
		// It stores the cumulative sum of array elements.
		int pref = 0;

		// Traverse each element of the array.
		for(int val : arr) {

			// Add the current element to the prefix sum.
			pref += val;

			// Check whether the current prefix sum is divisible by target.
			// If the remainder is zero, a qualifying prefix sum is found.
			if(pref % target == 0)
				return "YES";
		}

		// If no prefix sum is divisible by target, return NO.
		return "NO";
	}

}
