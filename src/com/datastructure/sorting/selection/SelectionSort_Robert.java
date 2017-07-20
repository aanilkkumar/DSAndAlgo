package com.datastructure.sorting.selection;

import com.datastructure.sorting.util.SortingUtil;

public class SelectionSort_Robert {

	public void sort(Integer[] arr){
		for (int i = 0; i < arr.length; i++) {
			Integer min = i;
			for(int j = i; j < arr.length; j++){
				if(SortingUtil.less(arr[j], arr[min])){
					min = j;
				}
			}
			SortingUtil.exchange(arr, i, min);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
