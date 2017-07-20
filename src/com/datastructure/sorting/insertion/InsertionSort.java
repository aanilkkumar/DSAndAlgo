package com.datastructure.sorting.insertion;

import com.datastructure.sorting.util.SortingUtil;

public class InsertionSort {

	public static void main(String[] args) {
		
		Integer arr[] = new Integer[6];
		arr[0] = 5;
		arr[1] = 3;
		arr[2] = 1;
		arr[3] = 2;	
		arr[4] = 0;
		arr[5] = 200;
		
		sort(arr);
		
		for (int t = 0; t < arr.length; t++) {
			System.out.println(arr[t]);
		}
		
	}
	

	public static void sort(Comparable[] arr){
		for (int i = 0; i < arr.length; i++) {
			// j > 0 or j>=0 think???
			for(int j = i; j > 0; j--){
				if(SortingUtil.less(arr[j], arr[j-1])){
					SortingUtil.exchange(arr, j, j-1);
				}
				// Think else
				else{
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
