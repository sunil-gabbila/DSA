
package com.kodnest.prefixhashset;

import java.util.HashMap;
import java.util.Scanner;

public class LongestEqual {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user.
		Scanner sc = new Scanner(System.in);

		// Read the size of the array.
		int n = sc.nextInt();

		// Declare an array of size n.
		int [] arr = new int[n];

		// Read all array elements from the user.
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Call the method to find the longest subarray
		// containing an equal number of 0s and 1s.
		// Print the length of that subarray.
		System.out.println(longestSubArrayEqualsZeroOne(n, arr));

		// Close the Scanner object.
		sc.close();

	}

	public static int longestSubArrayEqualsZeroOne(int n, int [] arr) {

		// HashMap stores:
		// Key   -> Prefix sum encountered so far.
		// Value -> First index at which that prefix sum occurred.
		HashMap<Integer, Integer> map = new HashMap<>();

		// Prefix sum represents the difference between the number
		// of 1s and 0s encountered so far.
		int pref = 0;

		// Stores the maximum length of a subarray
		// having an equal number of 0s and 1s.
		int maxLength = 0;

		// Initialize prefix sum 0 at index -1.
		// This helps calculate the length of a valid subarray
		// that starts from index 0.
		map.put(0, -1);

		// Traverse the array and calculate the prefix sum.
		for(int i = 0; i < n; i++) {

			// Treat 0 as -1 and 1 as +1.
			// If a subarray has an equal number of 0s and 1s,
			// its sum will be 0.
			if(arr[i] == 0)
				pref += -1;
			else
				pref += 1;

			// If the current prefix sum has appeared before,
			// the elements between the previous occurrence
			// and the current index have a sum of 0.
			// Therefore, that subarray contains equal numbers
			// of 0s and 1s.
			if(map.containsKey(pref)) {

				// Calculate the length of the valid subarray
				// using the first occurrence of this prefix sum.
				int curLength = i - map.get(pref);

				// Update the maximum length if the current
				// subarray is longer than the previous maximum.
				maxLength = Math.max(maxLength, curLength);

			}
			else {

				// Store the first occurrence of this prefix sum.
				// Do not update it later, because keeping the
				// earliest index helps obtain the longest subarray.
				map.put(pref, i);
			}

		}

		// If no valid subarray was found, return 0.
		if(maxLength == 0)
			return 0;

		// Return the length of the longest valid subarray.
		return maxLength;
	}

}
