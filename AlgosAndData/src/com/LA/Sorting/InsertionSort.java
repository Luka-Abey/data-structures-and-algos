package com.LA.Sorting;

public class InsertionSort {
	
	public static void insertionSort(int[] vals) {
		int currentIndex = 0;
		for (int pos = 1; pos < vals.length; pos++) {
			currentIndex = pos;
			while (currentIndex > 0 && vals[currentIndex] < vals[currentIndex-1]) {
				Swap.swap(vals, currentIndex, currentIndex-1);
				currentIndex = currentIndex-1;
			}
		}
	}
}
