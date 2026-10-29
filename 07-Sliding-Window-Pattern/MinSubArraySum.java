package com.kodnest.slidingwindow;

import java.util.Scanner;

public class MinSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Scanner object to read input from the user.
		Scanner sc = new Scanner(System.in);

		// Read the size of the array.
		int n = sc.nextInt();

		// Create an array of size n.
		int [] arr = new int[n];

		// Read all the array elements.
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Read the target sum.
		int windowSize = sc.nextInt();

		// Call the method to find the minimum subarray length
		// whose sum is greater than or equal to the target.
		System.out.println(minSubArraySum(n, arr, windowSize));

		// Close the Scanner object.
		sc.close();
	}

	// Method to find the minimum length of a contiguous
	// subarray whose sum is greater than or equal to the target.
	public static int minSubArraySum(int n, int [] arr, int target) {

		// Initialize the left pointer of the sliding window.
		int left = 0; 

		// Store the sum of the current window.
		int runSum = 0;

		// Initialize the minimum length to the maximum integer value.
		int minLength = Integer.MAX_VALUE;

		// Expand the window by moving the right pointer.
		for(int right = 0; right < n; right++) {

			// Add the current element to the running sum.
			runSum += arr[right];

			// Shrink the window while its sum is greater than
			// or equal to the target.
			while(runSum >= target) {

				// Calculate the current window length.
				int curLength = right - left+1;

				// Remove the leftmost element from the window sum.
				runSum -= arr[left];

				// Update the minimum subarray length.
				minLength = Math.min(minLength, curLength);

				// Move the left pointer forward to shrink the window.
				left++;
			}
		}

		// Return 0 if no valid subarray was found;
		// otherwise, return the minimum length.
		return (minLength == Integer.MAX_VALUE)? 0: minLength;
	}

}
