
package com.kodnest.interview;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fisrt Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		System.out.println("GCD --> " + greatestCommonDivider(num1, num2));
		
		
	}
	public static int greatestCommonDivider(int num1, int num2) {
		int gcd = 1;
		for(int i = 1; i <= num1 && i <= num2; i++) {
			if(num1 % i == 0 && num2 % i == 0 ) {
				gcd = i;
			}
		}
		return gcd;
	}

}
