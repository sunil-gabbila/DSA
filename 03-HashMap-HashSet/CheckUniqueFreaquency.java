package com.kodnest.Mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CheckUniqueFreaquency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(uniquefreq(n, arr));

	}
	
	public static String uniquefreq(int n, int [] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int val : arr) {
			map.put(val, map.getOrDefault(val, 0)+1);
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int value : map.keySet()) {
			list.add(map.get(value));
		}
		
		for(int i = 0; i < list.size()-1; i++) {
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(i)== list.get(j)) 
					return "NO";
			}
		}
		return "YES";
	}

}
