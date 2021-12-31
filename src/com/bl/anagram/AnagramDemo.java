package com.bl.anagram;

import java.util.Scanner;

public class AnagramDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings to check for Anagrams");
		
		String str1 = sc.next();
		String str2 = sc.next();
		 
		Anagram angrmObj = new Anagram();
		
		if(angrmObj.anagram(str1, str2)) {
			System.out.println("Strings are Anagram.");
		}else  {
			System.out.println("Strings are not Anagram.");
		}
		sc.close();
	}

}
