package com.bl.bubbleSortingUsingGenerics;

import java.util.Scanner;

public class BubbleSorting<T> {

	static Scanner sc = new Scanner(System.in);

	public static <T extends Comparable<T>> T[] bubbleSorting(T[] array) {
		int i, j;
		int length = array.length;
		for ( i = 0; i < length - i; i++) {
			for ( j = 1; j < length - i; j++) {
				if((array[j - 1]).compareTo(array[j]) > 0) {
					T temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;

				}
			}

		}
		return array;
	}
	public static <T> void printArray(T[] array) {
		System.out.println("\n"+"Sorted List:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+""+"\n");
		}
	}
	public static int getInteger() {
		return sc.nextInt();
	}
}
