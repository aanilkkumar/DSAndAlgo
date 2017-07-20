package com.datastructure.sorting.merge;

import com.datastructure.sorting.util.SortingUtil;

public class MergeSort {

	public void sort(Comparable[] arr) {
		Comparable[] aux = new Comparable[arr.length];
		sort(arr, aux, 0, arr.length-1);
		
		for (int t = 0; t < arr.length; t++) {
			System.out.println(arr[t]);
		}
	}

	private void sort(Comparable[] arr, Comparable[] aux, int lo, int hi) {
		if(hi<=lo){
			// Terminating condition.. when there is only element return.
			System.out.println(" values lo ="+lo+ ", and hi="+hi);
			return;
		}
		// Why to add lo while taking mid???
		int mid = lo+(hi-lo)/2;
//		System.out.println("calling till lo mid sort(arr, aux, lo, mid) with values lo ="+lo+ ", mid ="+ mid+" and hi="+hi);
		sort(arr, aux, lo, mid);
//		System.out.println("calling till mid+1 hi sort(arr, aux, mid+1, hi) with values mid+1 ="+(mid+1)+ " and hi="+hi);
		sort(arr, aux, mid+1, hi);
//		System.out.println("calling till merge with lo="+lo+" mid="+mid+" hi="+hi);
		merge(arr, aux, lo, mid, hi);
	}

	public void merge(Comparable[] arr, Comparable[] aux, int lo, int mid, int hi) {

		// Copy arr to aux.
		// Take 3 pointers i=low, j=mid+1 and k(arr)
		// Iterate aux to populate arr.
		// if i<
		//System.out.println("Merge called with lo="+lo+" mid="+mid+" hi="+hi);
		int i = lo, j = mid + 1;

		for (int j2 = 0; j2 < aux.length; j2++) {
			aux[j2] = arr[j2];
		}

		// Version 1
		// Think u have to traverse the complete array !!

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

			// Version 2
			// You will get Array Index??? why
//			if (SortingUtil.less(aux[i], aux[j])) {
//				arr[k] = aux[i];
//				i = i + 1;
//			}
//			else if (SortingUtil.less(aux[j], aux[i])) {
//				// check for ++ opportunity !!
//				arr[k] = aux[j++];
//			}
//			if (i > mid) {
//				arr[k] = aux[j++];
//			}
//			else if (j > hi) {
//				arr[k] = aux[i++];
//			}

		}

		// Version 1
		// Not so good way mate !!
//		int k;
//		for (k = 0; i <= mid && j <= hi; k++) {
//			if (SortingUtil.less(aux[i], aux[j]) || aux[i] == aux[j]) {
//				arr[k] = aux[i];
//				i++;
//			}
//			else {
//				arr[k] = aux[j];
//				j++;
//			}
//		}
//		if (!(i > mid)) {
//			arr[k] = aux[i];
//			i++;
//			k++;
//		}
//
//		for (int t = 0; t < arr.length; t++) {
//			System.out.println(arr[t]);
//		}
	}

}
