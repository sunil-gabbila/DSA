package com.kodnest.slidingwindow;

import java.util.Scanner;

public class MaxVowelsInWindow {

	// Method to check whether a character is a vowel.
	public static boolean isVowel(char ch) {

		// Return true if the character is a, e, i, o, or u.
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u')
            return true;
        else 
            return false;
    }

	// Method to find the maximum number of vowels
	// present in any window of the given size.
	public static int countVowelsInWind(String str, int size) {

		// Store the number of vowels in the current window.
		int vowels = 0;

		// Store the maximum number of vowels found.
		int maxVowel = 0;

		// Count vowels in the first window.
		for(int i = 0; i < size; i++) {

			// Check whether the current character is a vowel.
			if(isVowel(str.charAt(i)))
				vowels++;
		}

		// Initialize the maximum using the first window's count.
		maxVowel = vowels;

		// Slide the window one character at a time.
		for(int i = size; i < str.length(); i++) {

			// Get the character entering the window.
			char inComing = str.charAt(i);

			// Get the character leaving the window.
			char outGoing = str.charAt(i-size);

			// Decrease the vowel count if the outgoing
			// character is a vowel.
			if(isVowel(outGoing))
				vowels--;

			// Increase the vowel count if the incoming
			// character is a vowel.
			if(isVowel(inComing))
				vowels++;

			// Update the maximum vowel count.
			maxVowel = Math.max(maxVowel, vowels);
		}

		// Return the maximum number of vowels found.
		return maxVowel;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Scanner object to read input.
		Scanner sc = new Scanner(System.in);

		// Read the input string.
		String str = sc.next();

		// Read the window size.
		int size = sc.nextInt();

		// Call the method and print the maximum vowel count.
		System.out.println(countVowelsInWind(str, size));

		// Close the Scanner object.
		sc.close();
	}

}
