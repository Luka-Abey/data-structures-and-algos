package com.LA.Sorting;

public class InsertionSort {
	public static void insertionSort(int[] vals) {
		int currentIndex = 0;
		for (int pos = 1; pos < vals.length; pos++) {
			currentIndex = pos;
			while (currentIndex > 0 && vals[currentIndex] < vals[currentIndex-1]) {
				swap(vals, currentIndex, currentIndex-1);
				currentIndex = currentIndex-1;
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
	}

}
