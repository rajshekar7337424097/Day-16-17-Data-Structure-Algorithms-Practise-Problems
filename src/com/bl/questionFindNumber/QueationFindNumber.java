package com.bl.questionFindNumber;

import java.util.Scanner;

public class QueationFindNumber {
	
	static Scanner sc = new Scanner(System.in);
	
	public  int search(int low, int high) {
		if ((high - low) == 1) {
			return low;
		}
		int mid = low + (high - low) / 2;
		System.out.printf("Is is less the %d? ", mid);
		System.out.println();
		System.out.println("Enter the Ture or False to find your number ");
		boolean b = sc.nextBoolean();
		if(b) {
			return search(low, mid);
		}else {
			return search(mid, high);
		}
	}
}
