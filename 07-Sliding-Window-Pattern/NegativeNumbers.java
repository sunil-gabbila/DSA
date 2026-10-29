package com.kodnest.slidingwindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NegativeNumbers {

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

		// Call the method to find the first negative number
		// in every window and store the results in an array.
		long[] res = firstNegativeNumInWindow(n, arr, windowSize);

		// Print all the results separated by spaces.
		for(long val : res)
			System.out.print(val + " ");

		// Close the Scanner object.
		sc.close();
	}

	// Method to find the first negative number in each
	// contiguous window of the specified size.
	public static long[] firstNegativeNumInWindow(int n, int [] arr, int target) {

		// Create a list to store the first negative number
		// from each window.
		List<Integer> list = new ArrayList<>();

		// Track whether a negative number is found.
		boolean found = false;

		// Check the elements in the first window.
		for(int i = 0; i < target;i++) {

			// Check whether the current element is negative.
			if(arr[i] < 0) {

				// Add the first negative number to the result list.
				list.add(arr[i]);

				// Mark that a negative number has been found.
				found = true;

				// Stop searching the current window.
				break;
			}
		}

		// If the first window has no negative number,
		// add 0 to the result list.
		if(!found) 
			list.add(0);

		// Process the remaining windows one by one.
		for(int i = target; i < n;  i++) {

			// Reset the flag for the new window.
			found = false;

			// Check every element in the current window.
			for(int left = i-target+1; left <= i; left++) {

				// Check whether the current element is negative.
				if(arr[left] < 0) {

					// Add the first negative number found.
					list.add(arr[left]);

					// Mark that a negative number has been found.
					found = true;

					// Stop searching the current window.
					break;
				}

				// If no negative number has been found,
				// add 0 to the result list.
				if(!found)
					list.add(0);
			}
		}

		// Create a long array to store the final results.
		long [] lng = new long[list.size()];

		// Copy the elements from the list into the array.
        for(int i = 0; i < list.size(); i++) {
            lng[i] =  list.get(i);
        }

        // Return the array containing the results.
        return lng;
	}
}
