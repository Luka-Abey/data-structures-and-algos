package com.LA;

import com.LA.LinkedList.LinkedList;
import com.LA.Sorting.InsertionSort;
import com.LA.Sorting.SelectionSort;

public class Main {

	public static void main(String[] args) {
		int[] vals = {2,5,1,5,4,2};
		int[] vals2 = {2,5,1,5,4,2};
		
		System.out.println("Insertion Sort:");
		
		InsertionSort.insertionSort(vals);
		for(int i = 0; i<vals.length; i++) {
			System.out.print(vals[i] + " ");
		}
		
		System.out.println("\nSelection Sort: ");
		
		SelectionSort.selectionSort(vals2);
		for(int i = 0; i<vals2.length; i++) {
			System.out.print(vals2[i] + " ");
		}
		
		LinkedList list = new LinkedList(); 

    list = LinkedList.insert(list, 1); 
    list = LinkedList.insert(list, 2); 
    list = LinkedList.insert(list, 3); 
    list = LinkedList.insert(list, 4); 
    list = LinkedList.insert(list, 5); 
    list = LinkedList.insert(list, 6); 
    list = LinkedList.insert(list, 7); 
    list = LinkedList.insert(list, 8); 

    LinkedList.printList(list); 
		
	}
}
