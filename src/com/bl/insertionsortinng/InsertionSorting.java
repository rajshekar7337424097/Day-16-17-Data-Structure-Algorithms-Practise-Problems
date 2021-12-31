package com.bl.insertionsortinng;

public class InsertionSorting {

	public static <T extends Comparable <T>> T[] insertsort(T[] array) {
		int i;
		int temp;
		for (i = 1; i < array.length; i++) {
			T key = array[i];
			temp = i;

			while (temp > 0 && array[temp - 1].compareTo(key) > 0) {
				array[temp] = array[temp -1];
				temp --;
			}
			array[temp] = key;
		}
		return array;
	}

	public static <T> void printArray(T[] array) {
		System.out.println("\n" + "sorted list :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+ "" + "\n");
		}
	}
}
