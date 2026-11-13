package com.kodnest.interview;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		// Create Scanner object to get input from the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to enter a number
		System.out.println("Enter the num");

		// Store the original number entered by the user
		int orgNum = sc.nextInt();

		// Call checkPalindrome() method to reverse the original number
		int revNum = checkPalindrome(orgNum);

		// Compare the original number with its reversed number
		if (orgNum != revNum) {

			// If both numbers are different, it is not a palindrome
			System.out.println(orgNum + " is Not a Palindrome.");
		}

		else

			// If both numbers are equal, it is a palindrome
			System.out.println(orgNum + " is a Palindrome.");

		// Close the Scanner object to release resources
		sc.close();
	}

	public static int checkPalindrome(int num) {

		// Initialize rev to 0 to store the reversed number
		int rev = 0;

		// Repeat the loop until all digits are extracted
		while (num > 0) {

			// Extract the last digit of the number
			int rem = num % 10;

			// Append the extracted digit to the reversed number
			rev = (rev * 10) + rem;

			// Remove the last digit from the original number
			num = num / 10;
		}

		// Return the reversed number
		return rev;
	}
}
