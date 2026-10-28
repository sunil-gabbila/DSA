
package com.kodnest.prefixhashset;

import java.util.HashMap;
import java.util.Scanner;

public class CountEqualZeroOneSubarrays {

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

		// Call the counting method and print the total number
		// of subarrays containing equal numbers of 0s and 1s.
		System.out.println(counting(n, arr));

		// Close the Scanner object.
		sc.close();
	}

	public static int counting(int n, int [] arr) {

		// HashMap stores:
		// Key   -> Prefix sum encountered so far.
		// Value -> Number of times that prefix sum has occurred.
		HashMap<Integer, Integer> map = new HashMap<>();

		// pref stores the cumulative sum.
		// count stores the total number of valid subarrays.
		int pref = 0, count = 0;

		// Initialize prefix sum 0 with frequency 1.
		// This helps count valid subarrays that start at index 0.
		map.put(0, 1);

		// Traverse the array and calculate the prefix sum.
		for(int i = 0; i < n; i++) {

			// Treat 0 as -1 and 1 as +1.
			// A subarray with equal numbers of 0s and 1s
			// will have a sum of 0 after this transformation.
			if(arr[i] == 0)
				pref -= 1;
			else
				pref += 1;

			// If the current prefix sum has appeared before,
			// the elements between matching prefix sums
			// contain equal numbers of 0s and 1s.
			if(map.containsKey(pref)) {

				// Add the frequency of this prefix sum
				// to count all valid subarrays ending at index i.
				count += map.get(pref);
			}

			// Increase the frequency of the current prefix sum.
			// If it has not appeared before, initialize its frequency to 1.
			map.put(pref, map.getOrDefault(pref, 0) + 1);
		}

		// Return the total number of subarrays
		// containing equal numbers of 0s and 1s.
		return count;
	}

}
