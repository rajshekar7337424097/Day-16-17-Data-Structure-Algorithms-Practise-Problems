package com.bl.insertionSorting;

import java.util.Scanner;

public class InsertionSorting {

	static Scanner sc = new Scanner(System.in);

	public static <T extends Comparable<T>> T[] insertionSort(T[] array) {

		for (int i = 0; i < array.length; i++) {
			T key = array[i];
			int temp = i;

			while(temp > 0 && array[temp - 1].compareTo(key) > 0) {
				array[temp] = array[temp - 1];
				temp--;
			}
			array[temp] = key;
		}
		return array;
	}

	public static <T> void printArray(T[] array) {
		System.out.println("\n"+"Sorted List: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + ""+"\n");
		}	
	}
	public static int getinteger() {
		return sc.nextInt();

	}
}


