package com.kodnest.interview;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		// Create Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to enter a number
		System.out.println("Enter the Number");

		// Read the integer entered by the user
		int num = sc.nextInt();

		// Call factorial() method and display the calculated factorial
		System.out.println("Factorial of " + num + " = " + factorial(num));

		// Close the Scanner object to release resources
		sc.close();

	}

	public static int factorial(int num) {

		// Initialize fact to 1 because 1 is the multiplicative identity
		int fact = 1;

		// Iterate from 1 to the given number
		for (int i = 1; i <= num; i++) {

			// Multiply the current factorial value by i
			fact *= i;
		}

		// Return the final calculated factorial
		return fact;
	}
}
