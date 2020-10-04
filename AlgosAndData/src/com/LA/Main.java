package com.LA;

import com.LA.Sorting.InsertionSort;

public class Main {

	public static void main(String[] args) {
		int[] vals = {2,5,1,5,4,2};
		
		InsertionSort.insertionSort(vals);
		for(int i = 0; i<vals.length; i++) {
			System.out.println(vals[i]);
		}
	}

}
