package com.kodnest.interview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		// Create Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to enter a number
		System.out.println("Enter the Number");

		// Read the integer entered by the user
		int num = sc.nextInt();

		// Call checkPrime() method to check whether the number is prime
		boolean isPrime = checkPrime(num);

		// Check the returned boolean value
		if (isPrime)

			// If isPrime is true, display that the number is prime
			System.out.println(num + " is Prime Number");

		else

			// If isPrime is false, display that the number is not prime
			System.out.println(num + " is not Prime Number");

		// Close the Scanner object to release resources
		sc.close();
	}

	public static boolean checkPrime(int num) {

		// Assume the given number is prime initially
		boolean isPrime = true;

		// Numbers less than or equal to 1 are not prime numbers
		if (num <= 1)

			// Update isPrime to false for numbers less than or equal to 1
			isPrime = false;

		else {

			// Check whether the number is divisible by any number from 2 to num-1
			for (int i = 2; i < num; i++) {

				// If the remainder is 0, the number is divisible by i
				if (num % i == 0) {

					// The number has a divisor other than 1 and itself
					isPrime = false;

					// Stop the loop because the number is not prime
					break;
				}
			}
		}

		// Return true if prime, otherwise return false
		return isPrime;
	}
}
