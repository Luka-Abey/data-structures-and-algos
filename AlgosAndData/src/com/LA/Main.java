package com.LA;

import com.LA.Sorting.InsertionSort;
import com.LA.Sorting.SelectionSort;

public class Main {

	public static void main(String[] args) {
		int[] vals = {2,5,1,5,4,2};
		int[] vals2 = {2,5,1,5,4,2};
		
		System.out.println("Insertion Sort:");
		
		InsertionSort.insertionSort(vals);
		for(int i = 0; i<vals.length; i++) {
			System.out.println(vals[i]);
		}
		
		System.out.println("Selection Sort: ");
		
		SelectionSort.selectionSort(vals2);
		for(int i = 0; i<vals2.length; i++) {
			System.out.println(vals2[i]);
		}
	}

}
