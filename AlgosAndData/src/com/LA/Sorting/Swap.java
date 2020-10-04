package com.LA.Sorting;

public class Swap {
	public static void swap(int[] arr, int i, int j) {
		// simplest swap I could figure for lists 		
		arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
	}

}
