
package com.kodnest.prefixhashset;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayByK {

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
		// We need to find the longest subarray whose sum is divisible by k.
		int target = sc.nextInt();

		// Call the method and print the maximum subarray length.
		System.out.println(longestSubArrayByK(n, arr, target));

		// Close the Scanner object.
		sc.close();

	}

	public static int longestSubArrayByK(int n, int [] arr, int target) {

		// HashMap stores:
		// Key   -> Prefix sum.
		// Value -> First index where that prefix sum occurred.
		HashMap<Integer, Integer> map = new HashMap<>();

		// Stores the cumulative sum of array elements.
		int pref = 0;

		// Stores the maximum length of a valid subarray found so far.
		int maxLength = 0;

		// Initialize prefix sum 0 at index -1.
		// This helps calculate the length of a valid subarray
		// that starts from index 0.
		map.put(0, -1);

		// Traverse the array using its indices.
		for(int i = 0; i < n; i++) {

			// Add the current element to calculate the prefix sum.
			pref += arr[i];

			// Calculate the remainder when the prefix sum is divided by target.
			// Equal remainders indicate that the sum of the elements
			// between the corresponding prefix sums is divisible by target.
			int rem = pref % target;

			// Check whether this remainder has appeared before.
			if(map.containsKey(rem)) {

				// Calculate the length of the subarray using
				// the previously stored index of this remainder.
				int curlength = i - map.get(rem);

				// Update the maximum length if the current subarray is longer.
				maxLength = Math.max(maxLength, curlength);
			}

			// If the current prefix sum has not appeared before,
			// store its first occurrence and index.
			// Keeping the earliest index helps find the longest subarray.
			if(!map.containsKey(pref)) {
				map.put(pref, i);
			}
		}

		// Return the maximum length found.
		// Returns 0 if no valid subarray is found.
		return maxLength;
	}

}
