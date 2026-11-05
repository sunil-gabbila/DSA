package com.kodnest.Mapping;

import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.println(isomorphicCheck(str1, str2));

	}
	
	public static String isomorphicCheck(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return "NO";
		}
		
		HashMap<Character,Character > map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();
		
		
		for(int i = 1; i < str1.length();  i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			
			if(map1.containsKey(ch1)) {
				if(map1.get(ch1) != ch2) 
					return "NO";
			}
			
			if(map2.containsKey(ch2)) {
				if(map2.get(ch2) != ch1) {
					return "NO";
				}
			}
			map1.put(ch1, ch2);
			map2.put(ch2, ch1);
		}
		return "YES";
	}

}
