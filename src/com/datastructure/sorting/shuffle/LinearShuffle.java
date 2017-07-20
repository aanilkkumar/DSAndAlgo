package com.datastructure.sorting.shuffle;

import java.util.Random;

import com.datastructure.sorting.util.SortingUtil;


public class LinearShuffle {
	
	public void shuffle(Comparable[] arr) {

		int length = arr.length;
		
		for (int i = 0; i < length; i++) {
			Random rn = new Random();
			int randomIndex = rn.nextInt(i+1);
			
			SortingUtil.exchange(arr, i, randomIndex);
//			Comparable temp = arr[i];
//			arr[i] = arr[randomIndex];
//			arr[randomIndex] = temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
