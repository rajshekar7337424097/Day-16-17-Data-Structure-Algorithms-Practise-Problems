package com.bl.insertionsortinng;

import java.util.Scanner;

public class InsertionMain {
	static InsertionSorting insertion = new InsertionSorting();
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the string");
		int sizeString = sc.nextInt();
		
		String[] arrayString = new String[sizeString];
		int length = arrayString.length;
		System.out.println("enter the list of elements to be Sorted :");
		
		for (int i = 0; i < length; i++) {
			arrayString[i] = sc.next();
		}
		sc.close();
		insertion.insertsort(arrayString);
		insertion.printArray(arrayString);
		sc.close();
	}

}
