package com.datastructure.binarySearch;

public class BinarySearch {
	
	private final int arr[];
	
	public BinarySearch(int n) {
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i;
		}
	}
	
	public Status search(int n){
		
		int lo = 0, hi = arr.length, mid;
		//while (!(lo == hi)){
		while (lo <= hi){
			mid = (lo+hi)/2;
			// Think bada chota barabar : Logical flow 
			if(n < arr[mid]) {
				hi = mid-1;
			}
			else if(n > arr[mid]){
				lo = mid+1;
			}
			else{
				return Status.PRESENT;
			}
//			if(arr[mid] == n) {
//				return Status.PRESENT;
//			}
//			else if(n>arr[mid]){
//				lo = mid+1;
//			}
//			else{
//				hi = mid-1;
//			}
		}
		return Status.NOT_PRESENT;
	}

}
