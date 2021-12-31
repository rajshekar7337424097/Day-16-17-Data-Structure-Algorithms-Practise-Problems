package com.bl.bubbleortinngdescending;

import java.util.Scanner;

public class BubbleSortingDesMain {

	static BubbleSortingDesc bubbleSorting =  new BubbleSortingDesc();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array :");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter number to sort :");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		array = bubbleSorting.bubbleSortingDescending(array);
		System.out.println("------------Sorted Number");
		for (int i : array) {
			System.out.println(i);

		}
		sc.close();
	}
}
