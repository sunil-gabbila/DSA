package com.kodnest.strings;

import java.util.Scanner;

public class MergeStringsAlternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Scanner object to read input from the user.
		Scanner sc = new Scanner(System.in);

		// Read the first string.
		String str1 = sc.next();

		// Read the second string.
		String str2 = sc.next();

		// Call the method to merge both strings alternatively
		// and print the resulting string.
		System.out.println(mergingtwoStringsAlternatively(str1, str2));

		// Close the Scanner object.
		sc.close();

	}

	// Method to merge two strings alternatively,
	// taking one character from each string at a time.
	public static String mergingtwoStringsAlternatively(String w1, String w2) {

		// Create a StringBuilder to store the merged string.
		StringBuilder builder = new StringBuilder();

		// Initialize the index to access characters in both strings.
		int i = 0;

		// Continue until all characters from both strings are processed.
		while(i < w1.length() || i < w2.length()) {

			// If the first string has a character at the current index,
			// append that character to the StringBuilder.
			if(i < w1.length())
				builder.append(w1.charAt(i));

			// If the second string has a character at the current index,
			// append that character to the StringBuilder.
			if(i < w2.length())
				builder.append(w2.charAt(i));

			// Move to the next character position in both strings.
			i++;
		}

		// Convert the StringBuilder into a String and return it.
		return builder.toString();
	}

}
