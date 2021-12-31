package com.bl.primenumberanagram;

import java.util.Iterator;

public class PrimeAnagramDemo {

	static PrimeAnagramPallindrome primeAnagramPalindrome = new PrimeAnagramPallindrome();

	public static void main(String[] args) {

		String[] primeNumber = primeAnagramPalindrome.prime(1000);

		System.out.println("Anagram and prime numbers are :");
		for (int i = 0; i < primeNumber.length; i++) {
			for (int j = i + 1; j < primeNumber.length; j++) {
				if(primeAnagramPalindrome.anagram(primeNumber[i], primeNumber[j])) {
					System.out.println(primeNumber[i]+""+primeNumber[j]);
				}	
			}			
		}
		System.out.println("\nPalindrome and PrimeNumber are:");
		for (int i = 0; i < primeNumber.length; i++) {
			if(primeAnagramPalindrome.palindrome(primeNumber[i])) {
				System.out.println(primeNumber[i]);
			}
		}
	}
}
