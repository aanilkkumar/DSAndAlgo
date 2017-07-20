package com.datastructure.sorting.quick;

import com.datastructure.sorting.util.SortingUtil;

public class QuickSortWithDuplicateKey {

	// For merge sore it doen't matter.
	// For quick sort it takes quadratic time.
	
	// Why : What was the mistake :  keep the equal item in 1 sided--> similar to sorted array -> N^2/2 comparisions.
	// Partition doesn't do anything... peels off one element and compare.. N , N-1....
	// Put all equal item in place
	// AAA BBBBB CCCCC
	
	public static void main(String[] args) {

		
		
	}
	
public static int partition(Character[] arr, int lo, int hi){
		
		int i = lo, lt = lo;
		int j = hi, gt = hi+1;
		
		// 3 Jobs we need to do !!
		// 1. while i is less then j
		while(i != gt){
			// 2. scan (not increment i) i until it is less then a[lo]
			while(arr[++lt] < arr[lo]){
				lt++;
				i++;
			}
			SortingUtil.exchange(arr, lt, i);
			while(arr[--gt] > arr[lo]){
				gt--;
				i++;
			}
			SortingUtil.exchange(arr, gt, i);
			while(arr[i] == arr[lo]){
				i++;
			}
			
			
		}
		// SortingUtil.exchange(arr, lo, j);
		return j;
	}

}
