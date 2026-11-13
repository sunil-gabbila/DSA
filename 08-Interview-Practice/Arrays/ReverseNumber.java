package com.kodnest.interview;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int  num = sc.nextInt();
		
		System.out.println("Reversed Number" + reverseNumber(num));
		sc.close();

	}
	public static int reverseNumber(int num) {
		int rev = 0;
		while(num > 0) {
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num = num/10;
		}
		return rev;
	}
	

}
