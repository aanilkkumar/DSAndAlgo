package com.datastructure.sorting.util;

public class SortingUtil {

	public static boolean less(Comparable v, Comparable w){
		return v.compareTo(w)<0;
	}
	
	
	public static void exchange(Comparable[] v, int a, int b){
		Comparable comparable = v[a];
		v[a] = v[b];
		v[b] = comparable;
	}
	
	//  Design Modification:
	//	From MergeSort I want to sort the list of Students that to based on the age of the students.
	
}
