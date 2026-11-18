package com.kodnest.interview;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Creating Scanner object to get input from the user
		Scanner sc = new Scanner(System.in);

		// Asking the user to enter a number
		System.out.println("Enter the number");

		// Reading the input number
		int num = sc.nextInt();

		// Calling sumNumbers() method and printing the result
		System.out.println(sumNumbers(num));

		// Closing the Scanner object
		sc.close();

	}

	/**
	 * This method calculates the sum of individual digits
	 * of the given number.
	 *
	 * Example:
	 * Input: 1234
	 * Calculation: 1 + 2 + 3 + 4
	 * Output: 10
	 *
	 * @param num The number whose digits need to be added
	 * @return The sum of individual digits
	 */
	public static int sumNumbers(int num) {

		// Initializing sum to store the total of digits
		int sum = 0;

		// Loop executes until all digits are extracted
		while(num > 0) {

			// Extracting the last digit using modulo operator
			int rem = num % 10;

			// Adding the extracted digit to sum
			sum += rem;

			// Removing the last digit using integer division
			num = num / 10;

		}

		// Returning the final sum
		return sum;

	}

}
