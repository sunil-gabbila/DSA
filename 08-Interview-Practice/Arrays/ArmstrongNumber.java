package com.kodnest.interview;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Creating Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Asking the user to enter a number
		System.out.println("Enter the number");

		// Reading the number entered by the user
		int num = sc.nextInt();

		// Calling armstrongChecK() method to calculate
		// the sum of cubes of individual digits
		int sum = armstrongChecK(num);

		// Comparing the calculated sum with the original number
		// If both are equal, the number is an Armstrong number
		if (sum == num)

			// Printing the result if the number is an Armstrong number
			System.out.println("Armstrong number");

		else

			// Printing the result if the number is not an Armstrong number
			System.out.println("Not an armsrong number");

		// Closing the Scanner object
		sc.close();

	}

	/**
	 * This method calculates the sum of cubes of individual digits
	 * of the given number.
	 *
	 * Example:
	 * Input: 153
	 * Calculation: 1^3 + 5^3 + 3^3
	 * Result: 153
	 *
	 * @param num The number whose individual digits are cubed
	 * @return The sum of cubes of the individual digits
	 */
	public static int armstrongChecK(int num) {

		// Initializing sum to store the sum of cubes of digits
		int sum = 0;

		// Loop executes until all digits of the number are processed
		while (num > 0) {

			// Extracting the last digit of the number using modulo operator
			int rem = num % 10;

			// Calculating the cube of the extracted digit
			int cube = rem * rem * rem;

			// Adding the cube of the digit to the sum
			sum += cube;

			// Removing the last digit from the number
			// Integer division by 10 removes the last digit
			num = num / 10;

		}

		// Returning the final sum of cubes of individual digits
		return sum;

	}

}
