package com.kodnest.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		// Create Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// Read the number of Fibonacci elements to generate
		int num = sc.nextInt();

		// Call printingFibinocciSeries() method to generate the Fibonacci series
		ArrayList<Integer> list = (ArrayList<Integer>) printingFibinocciSeries(num);

		// Iterate through the list and print each Fibonacci number
		for (int val : list) {

			// Print each element followed by a space
			System.out.print(val + " ");
		}

		// Close the Scanner object to release resources
		sc.close();

	}

	public static List<Integer> printingFibinocciSeries(int num) {

		// Create an ArrayList to store the Fibonacci series
		List<Integer> list = new ArrayList<>();

		// Initialize the first Fibonacci number
		int a = 0;

		// Initialize the second Fibonacci number
		int b = 1;

		// Repeat the loop num times to generate the required Fibonacci elements
		for (int i = 1; i <= num; i++) {

			// Add the current Fibonacci number to the list
			list.add(a);

			// Calculate the next Fibonacci number by adding the previous two numbers
			int c = a + b;

			// Update a with the value of b
			a = b;

			// Update b with the newly calculated Fibonacci number
			b = c;
		}

		// Return the list containing the Fibonacci series
		return list;
	}
}
