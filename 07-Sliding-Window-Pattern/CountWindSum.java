package com.kodnest.slidingwindow;

import java.util.Scanner;

public class CountWindSum {

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

		// Read the target sum.
		int target = sc.nextInt();

		// Call the method to count how many windows have
		// a sum greater than the target and print the result.
		System.out.println(countWindSumGreaterThanTarget(n, arr, windowSize, target));

		// Close the Scanner object.
		sc.close();

	}

	// Method to count the number of windows whose sum
	// is greater than the given target.
	public static int countWindSumGreaterThanTarget(int n, int [] arr, int size,int target) {

		// Initialize the sum of the current window.
		int windSum = 0;

		// Initialize the count of valid windows.
		int count = 0;

		// Calculate the sum of the first window.
		for(int i = 0; i < size; i++) {

			// Add each element to the window sum.
			windSum += arr[i];
		}

		// Check whether the first window sum is greater
		// than the target.
		if(windSum > target)
			count++;

		// Slide the window one element at a time.
		for(int i = size; i < n; i++) {

			// Remove the outgoing element and add
			// the incoming element to update the window sum.
			windSum = windSum - arr[i-size] + arr[i];

			// Check whether the current window sum
			// is greater than the target.
			if(windSum > target)
				count++;
		}

		// Return the total number of windows
		// whose sums are greater than the target.
		return count;
	}

}
