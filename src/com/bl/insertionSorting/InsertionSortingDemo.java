package com.bl.insertionSorting;

import java.util.Iterator;
import java.util.Scanner;

public class InsertionSortingDemo {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in); 
			
		System.out.println("Enter the size of List:");
		int size = sc.nextInt();
		Integer[] array = new Integer[size];
		System.out.println("enter the Elements to be sorted:");
		for (int i = 0; i < array.length; i++) {
			array[i] = InsertionSorting.getinteger();
		}
		InsertionSorting.insertionSort(array);
		InsertionSorting.printArray(array);
		
		String[] arrayString = new String[size];
		int length = array.length;
		sc.close();
	}
}
