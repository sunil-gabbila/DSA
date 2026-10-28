
package com.kodnest.prefixhashset;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayCountByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Scanner object to read input from the user.
		Scanner sc = new Scanner(System.in);

		// Read the size of the array.
		int n = sc.nextInt();

		// Declare an integer array of size n.
		int [] arr = new int[n];

		// Read all array elements from the user.
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Read the target value k.
		// We need to count subarrays whose sum is divisible by k.
		int target = sc.nextInt();

		// Call the method and print the total number of qualifying subarrays.
		System.out.println(subArrayCountDivisibleByK(n, arr, target));

		// Close the Scanner object.
		sc.close();

	}

	public static int subArrayCountDivisibleByK(int n, int [] arr, int target) {

		// HashMap stores:
		// Key   -> Remainder of a prefix sum divided by target.
		// Value -> Number of times that remainder has occurred.
		HashMap<Integer, Integer> map = new HashMap<>();

		// Stores the cumulative sum of array elements.
		int pref = 0;

		// Counts the number of subarrays whose sum is divisible by target.
		int count = 0;

		// Initialize remainder 0 with frequency 1.
		// This accounts for subarrays starting at index 0
		// whose sum is directly divisible by target.
		map.put(0, 1);

		// Traverse each element of the array.
		for(int i : arr) {

			// Add the current element to calculate the prefix sum.
			pref += i;

			// Calculate the remainder of the prefix sum.
			int rem = pref % target;

			// If this remainder has appeared before,
			// the difference between the current prefix sum
			// and each matching previous prefix sum is divisible
			// by target.
			if(map.containsKey(rem)) {

				// Add the frequency of this remainder to the count.
				// Each previous occurrence identifies one qualifying subarray.
				count += map.get(rem);
			}

			// Increase the frequency of the current remainder.
			// If it has not appeared before, initialize its frequency to 1.
			map.put(rem, map.getOrDefault(rem, 0) + 1);
		}

		// Return the total number of subarrays whose sum is divisible by target.
		return count;
	}

}
