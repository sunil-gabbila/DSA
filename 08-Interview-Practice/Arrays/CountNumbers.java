package com.kodnest.interview;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Creating Scanner object to get input from the user
		Scanner sc = new Scanner(System.in);

		// Asking the user to enter a number
		System.out.println("enter the number");

		// Reading the number entered by the user
		int num = sc.nextInt();

		// Calling countNumbers() method and printing the result
		System.out.println(countNumbers(num));

		// Closing the Scanner object
		sc.close();

	}

	/**
	 * This method counts the total number of digits
	 * present in the given number.
	 *
	 * Example:
	 * Input: 12345
	 * Output: 5
	 *
	 * @param num The number whose digits need to be counted
	 * @return Total count of digits
	 */
	public static int countNumbers(int num) {

		// Initializing count to zero
		int count = 0;

		// Loop executes until all digits are removed
		while(num > 0) {

			// Extracting the last digit using modulo operator
			int rem = num % 10;

			// Increasing the count for every extracted digit
			count++;

			// Removing the last digit using integer division
			num = num / 10;

		}

		// Returning the total number of digits
		return count;

	}

}
