package com.LA;

import com.LA.LinkedList.LinkedList;
import com.LA.Sorting.InsertionSort;
import com.LA.Sorting.MergeSort;
import com.LA.Sorting.SelectionSort;
import com.LA.Trees.BinaryTree;

public class Main {

	public static void main(String[] args) {
		int[] vals = { 4, 6, 1, 5, 3, 2, 7, 8, 9, 10 };
		int[] vals2 = { 3, 5, 1, 6, 4, 2, 7, 8, 9, 10 };
    int[] vals3 = { 5, 1, 6, 2, 3, 4, 7, 8, 9, 10 };

    
		System.out.println("Insertion Sort:");
    long startTime = System.nanoTime();

    InsertionSort.insertionSort(vals);
		for(int i = 0; i<vals.length; i++) {
			System.out.print(vals[i] + " ");
		}

	  long endTime = System.nanoTime();
	  System.out.println("\nTook "+(endTime - startTime) + " ns"); 
		
	  
	  
		System.out.println("\nSelection Sort: ");
	  
	  long startTime2 = System.nanoTime();

		SelectionSort.selectionSort(vals2);
		for(int i = 0; i<vals2.length; i++) {
			System.out.print(vals2[i] + " ");
		}

	  long endTime2 = System.nanoTime();
	  System.out.println("\nTook "+(endTime2 - startTime2) + " ns"); 
		
	  
		
		System.out.println("\nMerge Sort:");
		
		long startTime3 = System.nanoTime();

		MergeSort.mergeSort(vals3, vals3.length);
    for(int i = 0; i<vals3.length; i++) {
			System.out.print(vals3[i] + " ");
		}

	  long endTime3 = System.nanoTime();
	  System.out.println("\nTook "+(endTime3 - startTime3) + " ns");
		
		
		
		LinkedList list = new LinkedList(); 

    list = LinkedList.insert(list, 1); 
    list = LinkedList.insert(list, 2); 
    list = LinkedList.insert(list, 3); 
    list = LinkedList.insert(list, 4); 
    list = LinkedList.insert(list, 5); 
    list = LinkedList.insert(list, 6);  

    LinkedList.printList(list); 	
    
    // binary tree
    BinaryTree.class;
	}
}
