package com.datastructure.sorting.selectionProblem;

import com.datastructure.sorting.util.SortingUtil;

public class Selection {
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[]{7,8,9,10,1,2,3,4,5,6};
		
		int k = 7;
//		int temp;
//		
//		int smallest = 0;
//		for (int i = 0; i <= k; i++) {
//			smallest = i;
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[j]<arr[smallest]){
//					smallest = j;
//				}
//			}
//			// swap arr[i] and arr[smallest]
//			temp = arr[i];
//			arr[i]=arr[smallest];
//			arr[smallest]=temp;			
//		}
		
		System.out.println("Kth largest element is:"+ select(arr, k));
	}
	

	public static int select(Integer[] arr, int k){
		
		int lo = 0, hi = arr.length-1;
		
		while(hi>lo){
			int j = partition(arr, lo, hi);
			if(j>k){
				hi = j-1;
			}
			else if (j<k){
				lo = j+1;
			}
			else{
				// Repeat until u reach to that point/ u have only one element : all element left small. right : big
				return arr[k];
			}
		}
		return arr[k];
	}
	
	public static int partition(Integer[] arr, int lo, int hi){
		
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
