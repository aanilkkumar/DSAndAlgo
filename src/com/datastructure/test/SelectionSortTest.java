package com.datastructure.test;

public class SelectionSortTest {
	
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
	
	public static void sort(Integer[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i--;
				}
			}
		}
	}
	
//	public static void sort(Integer[] arr){	
//		for(int i = 0; i<arr.length; i++){
//			int min = i;
//			for(int j=i; j<arr.length; j++){
//				if(arr[j]<arr[min]){
//					min = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//		}
//	}
	
	
}
