package com.datastructure.sorting.selection;



public class SelectionSort {
	
	public void sort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			int min = min(arr, i+1);
			if(arr[min]<arr[i]){
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	private int min(int[] array, int from){
		int min = array[from];
		int minIndex = from;
		for (int i = from; i < array.length; i++) {
			if(array[i]<min){
				min = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
}
