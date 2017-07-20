package com.datastructure.sorting.selection;


import com.datastructure.sorting.merge.MergeSort;

public class Main {
	
	
	public static void main(String[] args) {
//		int arr[] = new int[6];
//		arr[0] = 5;
//		arr[1] = 3;
//		arr[2] = 1;
//		arr[3] = 2;	
//		arr[4] = 3;	
//		arr[5] = 9;	
//		
//		SelectionSort selectionSort = new SelectionSort();
//		selectionSort.sort(arr);
		
		
		Integer arr[] = new Integer[4];
//		arr[0] = 5;
//		arr[1] = 3;
//		arr[2] = 1;
//		arr[3] = 2;	
//		arr[4] = 3;	
//		arr[5] = 9;	
//		arr[6] = 4;
//		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;	
//		arr[4] = 5;	
//		arr[5] = 6;	
//		arr[6] = 7;
		
//		SelectionSort_Robert selectionSort_Robert = new SelectionSort_Robert();
//		selectionSort_Robert.sort(arr);
		
//		InsertionSort insertionSort = new InsertionSort();
//		insertionSort.sort(arr);
//		
//		Employee array[] = new Employee[2];
//		Employee employee1 = new Employee(2, "Sinha");
//		Employee employee2 = new Employee(1, "Atibhav");
//		array[0] = employee1;
//		array[1] = employee2;
//		
//		insertionSort.sort(array);
		
//		ShellSort shellSort = new ShellSort();
//		shellSort.sort(arr);
		
//		LinearShuffle linearShuffle = new LinearShuffle();
//		linearShuffle.shuffle(arr);
		
//		arr[0] = 1;
//		arr[1] = 5;
//		arr[2] = 6;
//		arr[3] = 24;	
//		arr[4] = 10;	
//		arr[5] = 15;	
//		arr[6] = 20;
		
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = 8;
		arr[3] = 24;	
//		arr[4] = 12;	
//		arr[5] = 50;	
//		arr[6] = 20;
		
		MergeSort mergeSort = new MergeSort();
		
		mergeSort.sort(arr);
		
	}

}
