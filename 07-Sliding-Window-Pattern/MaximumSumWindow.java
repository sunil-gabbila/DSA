package com.kodnest.slidingwindow;

import java.util.Scanner;

public class MaximumSumWindow {

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

		// Read the size of the sliding window.
		int windowSize = sc.nextInt();

		// Call the method to find the maximum window sum
		// and print the result.
		System.out.println(maxSumWindow(n, arr, windowSize));

		// Close the Scanner object.
		sc.close();

	}

	// Method to find the maximum sum of any contiguous
	// subarray of the given window size.
	public static int maxSumWindow(int n, int [] arr, int windowSize) {

		// Calculate the sum of the first window.
		int windSum = 0;
		for(int i = 0; i < windowSize; i++) {
			windSum += arr[i];
		}

		// Initialize the maximum sum.
		int maxSum = 0; 

		// Slide the window one element at a time.
		for(int i = windowSize; i < n; i++) {

			// Identify the element going out of the window.
			int og = arr[i-windowSize];

			// Identify the new element entering the window.
			int ic = arr[i];

			// Update the window sum by subtracting the outgoing
			// element and adding the incoming element.
			windSum = windSum - og + ic;

			// Update the maximum sum if the current window
			// sum is greater than the previous maximum.
			maxSum = Math.max(maxSum, windSum);
		}

		// Return the maximum window sum.
		return maxSum;
	}

}
