package com.kodnest.interview;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Creating Scanner object to get input from the user
		Scanner sc = new Scanner(System.in);

		// Asking the user to enter a number
		System.out.println("enter the number");

		// Reading the number entered by the user
		int num = sc.nextInt();

		// Calling findLargetNumber() method and printing the result
		System.out.println(findLargetNumber(num));

		// Closing the Scanner object
		sc.close();

	}

	/**
	 * This method finds the largest digit present in the given number.
	 *
	 * Example:
	 * Input: 58329
	 * Output: 9
	 *
	 * @param num The number whose largest digit needs to be found
	 * @return The largest digit in the given number
	 */
	public static int findLargetNumber(int num) {

		// Initializing max to store the largest digit
		int max = 0;

		// Loop executes until all digits are extracted
		while(num > 0) {

			// Extracting the last digit using modulo operator
			int rem = num % 10;

			// Checking whether the extracted digit is greater than
			// or equal to the current maximum digit
			if(rem >= max)

				// Updating max if a larger digit is found
				max = rem;

			// Removing the last digit from the number
			num = num / 10;

		}

		// Returning the largest digit
		return max;

	}

}
