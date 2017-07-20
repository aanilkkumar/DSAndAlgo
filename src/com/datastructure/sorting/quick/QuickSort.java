package com.datastructure.sorting.quick;

import com.datastructure.sorting.util.SortingUtil;


public class QuickSort {
	
	// Random Shuffel is needed and mandatory to get performance.
	
	public static void main(String[] args) {
		Character[] arr = new Character[]{'K','R','A','T','E','L','E','P','U','I','M','Q','C','X','O','S'};
		//Character[] arr = new Character[]{'a','b','c','d'};
		// Shuffel the array : why?
		sort(arr);
		partition(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void sort(Character[] arr){
		sort(arr, 0, arr.length-1);
	}
	

	public static void sort(Character[] arr, int lo, int hi){
		// Termination Condition of recursion
		if(hi<=lo) return;
		int k = partition(arr, lo, hi);
		System.out.println("Pivot= "+k);
		sort(arr,lo,k-1);
		sort(arr,k+1,hi);
	}
	
	
	public static int partition(Character[] arr, int lo, int hi){
		
		int i = lo;
		int j = hi;
		// 3 Jobs we need to do !!
		// 1. while i is less then j
		while(i<j){
			// 2. scan (not increment i) i until it is less then a[lo]
			while(arr[i]<=arr[lo]){
				i++;
				// Think if we do this and reach to end then array (either end ) it is already sorted : Very imp
				if(i == hi)
					break;
			}
			// 2.1. scan (not increment i) j until it is greater then a[lo]
			while(arr[j]>arr[lo]){
				// Left subarray will have value less then equals where right will have only greater
				j--;
				// When we are decrementing see we should not decrement below zero 
				// Not needed think why?
				if(j == lo)
					break;
			}
			// Missed this work. ??????? Missed the = also
			// Nothing happens we need not to do defualt sorting
			if(i>=j){
				break;
			}
			// 3. once 
			SortingUtil.exchange(arr, i, j);
		}
		SortingUtil.exchange(arr, lo, j);
		return j;
	}
}

// 1. Partition: Work from left to right by dividing each sub array in half!!: Work on left subarray / then right subarray.
// Pivot -> divide left sub array
