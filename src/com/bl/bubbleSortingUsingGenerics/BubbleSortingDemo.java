package com.bl.bubbleSortingUsingGenerics;

import java.util.Scanner;

public class BubbleSortingDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the Size of list:");
		int size = sc.nextInt();
		Integer[] array = new Integer[size];
		System.out.println("enter the List of Elements to be Sorted:");
		for (int i = 0; i < array.length; i++) {
			array[i] = BubbleSorting.getInteger();
		}
		BubbleSorting.bubbleSorting(array);
		BubbleSorting.printArray(array);
		
		String [] arrayString = new String[size];
		int length = array.length;
		sc.close();
	}
}
