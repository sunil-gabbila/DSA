package com.Strings;

import java.util.Scanner;

public class ReverseSringWords {

	public static void main(String[] args) {

		// Create a Scanner object to read input from the user.
		Scanner sc = new Scanner(System.in);

		// Display a message asking the user to enter a string.
		System.out.println("Enter the String");

		// Read the complete input line and split it into words
		// whenever a space is encountered.
		String [] str = sc.nextLine().split(" ");

		// Call the reverseString() method to reverse each word
		// and print the resulting string.
		System.out.println("Reversed string: " + reverseString(str));

		// Close the Scanner object.
		sc.close();
	}

	// Method to reverse each individual word in the given string array.
	public static String reverseString(String [] str) {

		// Create a StringBuilder to store the reversed words.
		StringBuilder sb = new StringBuilder();

		// Iterate through each word in the string array.
		for(int i = 0; i < str.length; i++) {

			// Start from the last character of the current word
			// and move towards its first character.
			for(int j = str[i].length()-1;j >= 0; j--) {

				// Append each character in reverse order.
				sb.append(str[i].charAt(j));
			}

			// Append a space after each reversed word.
			sb.append(" ");
		}

		// Convert StringBuilder into a String and return the result.
		return sb.toString();
	}

}
