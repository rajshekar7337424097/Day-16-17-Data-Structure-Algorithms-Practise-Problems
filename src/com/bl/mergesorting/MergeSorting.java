package com.bl.mergesorting;

public class MergeSorting {

	void merge( int arr[], int l, int middle, int r) {

		int n1 = middle -l + 1;
		int n2 = r - middle;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
			for (int j = 0; j < n2; j++) {
				R[j] = arr[middle + 1 + j];
			}
		}

		int i = 0 , j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public void sort (int arr[], int l, int r) {
		if(l < r) {
			int middle = l + (r - l)/2;
			sort(arr, l, middle);
			sort(arr, middle + 1, r);

			merge(arr, l,  middle, r);
		}
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.println(arr[i] + "");
			System.out.println();

		}
	}
}
