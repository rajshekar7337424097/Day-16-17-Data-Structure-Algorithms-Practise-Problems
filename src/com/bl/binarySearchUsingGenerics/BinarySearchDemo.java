package com.bl.binarySearchUsingGenerics;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of list: ");
		int size = BinarySearch.getInteger();
		Integer[] array = new Integer[size];
		System.out.println("Enter the List of elements to be Sorted :");
		for (int i = 0; i < array.length; i++) {
			array[i] = BinarySearch.getInteger();	
		}
		Arrays.sort(array);
		System.out.println("enter the Key Element to search:");
		int key1 = BinarySearch.getInteger();
		
		if(BinarySearch.binarySearch(array, key1, 0, array.length - 1) != 0) {
			System.out.println("Element Found ");
		}else {
			System.out.println("Element not Found");
		}
		
		System.out.println("enter the Size of the String:");
		int sizeString = BinarySearch.getInteger();
		String[] arrayString = new String[sizeString];
		System.out.println("enter the List of a Elements to be Sorted:");
		for (int i = 0; i < arrayString.length; i++) {
			arrayString[i] = BinarySearch.getString();
		}
		Arrays.sort(arrayString);
		System.out.println("Sorted arrat list is :" +Arrays.toString(arrayString));
		
		System.out.println("Enter the Key Element to search:");
		String key2 = BinarySearch.getString();
		if (BinarySearch.binarySearch(arrayString, key2, 0, arrayString.length - 1) != 0) {
			System.out.println("Element found..");
		}else {
			System.out.println("Element not Found..");
		}
	}
}
