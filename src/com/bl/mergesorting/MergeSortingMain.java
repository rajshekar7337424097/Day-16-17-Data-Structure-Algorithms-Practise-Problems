package com.bl.mergesorting;


import java.util.Scanner;

public class MergeSortingMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to sort");
		int number = sc.nextInt();
		
		int[] arr = new int[number];
		
//		printArray(arr);
		
		MergeSorting ob = new MergeSorting();
		ob.sort(arr, 0, arr.length - 1);
		
		System.out.println("\nSorted array");
		ob.printArray(arr);
		sc.close();
	}
}
