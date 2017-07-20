package com.datastructure.sorting.merge;

import com.datastructure.sorting.util.SortingUtil;

public class BottomUpMergeSort {

	public static void main(String[] args) {

		Integer[] arr = new Integer[11];
		arr[0] = 2;
		arr[1] = 100;
		arr[2] = 4;
		arr[3] = 300;
		arr[4] = 6;
		arr[5] = 5;
		arr[6] = 8;
		
		arr[7] = 6000;
		arr[8] = 500;
		arr[9] = 80;
		arr[10] = 80000;
		
		sort(arr);
	}

	public static void sort(Integer[] arr) {

		int lo, hi, mid;
		Comparable[] aux = new Integer[arr.length];
		
//		for (int i = 2; i <= arr.length*2;) {
//			for (int j = 0; j < arr.length; j=j+i) {
//				lo = j;
//				hi = j+i-1;
//				mid = lo + (hi-lo)/2;
//				merge(arr, aux, lo, mid, hi<arr.length ? hi : arr.length-1);;					
//			}
//			System.out.println("i="+i);
//			i = 2 * i;
//		}
		
		for (int i = 1; i <= arr.length*2; i = 2 * i) { // arr.len??? // how to come up ??
			for (int j = 0; j < arr.length; j=j+i) { // full traverse // think what u need ...create them ... then think of populating
				lo = j;
				hi = j+i-1;
				mid = lo + (hi-lo)/2;
				merge(arr, aux, lo, mid, hi<arr.length ? hi : arr.length-1); //					
			}
			System.out.println("i="+i);
			
		}
		
		for (int t = 0; t < arr.length; t++) {
			System.out.println(arr[t]);
		}
	}

	public static void merge(Comparable[] arr, Comparable[] aux, int lo, int mid, int hi) {
		int i = lo, j = mid + 1;

		for (int j2 = 0; j2 < aux.length; j2++) {
			aux[j2] = arr[j2];
		}

		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				arr[k] = aux[j++];
			}
			else if (j > hi) {
				arr[k] = aux[i++];
			}
			else if (SortingUtil.less(aux[j], aux[i])) {
				arr[k] = aux[j++];

			}
			else {
				// check for ++ opportunity !!
				arr[k] = aux[i];
				i = i + 1;
			}

		}

	}
}
