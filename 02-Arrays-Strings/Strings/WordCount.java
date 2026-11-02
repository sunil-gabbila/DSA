package com.Strings;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Scanner object to read input from the user.
		Scanner sc = new Scanner(System.in);

		// Read the complete input string, including spaces.
		String str = sc.nextLine();

		// Call the wordCountOfString() method and print
		// the total number of words in the given string.
		System.out.println("Count: " + wordCountOfString(str));;

		// Close the Scanner object.
		sc.close();
	}

	// Method to count the number of words in a given string.
	public static int wordCountOfString(String str) {

		// Flag to identify whether the current character
		// belongs to an existing word.
		boolean isWord = false;

		// Variable to store the total number of words.
		int count = 0;

		// Traverse each character in the input string.
		for(int i = 0; i < str.length(); i++) {

			// If the current character is a space,
			// mark that we are outside a word.
			if(str.charAt(i) == ' ') 
				isWord = false;

			// If the current character is not a space
			// and we are not already inside a word,
			// a new word has started.
			else if(!isWord) {

				// Increment the word count.
				count++;

				// Mark that we are now inside a word.
				isWord = true;
			}
		}

		// Return the total number of words.
		return count;
	}

}
