package com.kodnest.slidingwindow;

import java.util.Scanner;

public class MaximumAvgWindow {

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

		// Call the method to find the maximum average
		// and print the result.
		System.out.println(maxAvgWindow(n, arr, windowSize));

		// Close the Scanner object.
		sc.close();

	}

	// Method to find the maximum average of any
	// contiguous subarray of the given window size.
	public static double maxAvgWindow(int n, int [] arr, int size) {

		// Initialize the maximum average to 0.
		double maxAvg = 0;

		// Initialize the sum of the current window.
		double windSum = 0;

		// Calculate the sum of the first window.
		for(int i = 0; i < size; i++) {
			windSum += arr[i];
		}

		// Calculate the average of the first window.
		double windAvg = windSum/size;

		// Slide the window one element at a time.
		for(int i = size; i < n; i++) {

			// Remove the element that goes out of the window
			// and add the new element entering the window.
			windSum = windSum - arr[i-size] + arr[i];

			// Calculate the average of the current window.
			windAvg = windSum/size;

			// Update the maximum average if the current
			// window average is greater.
			maxAvg = Math.max(windAvg, maxAvg);
		}

		// Return the maximum average found.
		return maxAvg;
	}

}
