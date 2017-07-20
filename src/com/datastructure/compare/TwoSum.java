package com.datastructure.compare;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		Integer[] arr = new Integer[6];

		int target = 6;
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 6;
		arr[4] = 3;
		arr[5] = 5;
		
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i]+arr[j] == target){
//					System.out.println("Got the target on i = "+i+" and j="+j);
//				}
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			test.put(arr[i], i);
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(test.containsKey(target-arr[i]) && test.get(target-arr[i]) > i){
//				System.out.println("Got the target on i = "+i+" and j= "+test.get(target-arr[i]));
//			}
//		}
		
//		Got the target on i = 1 and j=3
//				Got the target on i = 4 and j=5
		
		Integer[] result = twoSum(arr, target);
		for (int i = 0; i < result.length; i++) {
			System.out.println("Index = "+result[i]);
		}
		
	}

	private static Integer[] twoSum(Integer[] arr, int target) {
		HashMap<Integer,Integer> test = new HashMap<>();
		Integer[] result = new Integer[2];
		for (int i = 0; i < arr.length; i++) {
			test.put(arr[i], i);
			if(test.containsKey(target-arr[i]) && i > test.get(target-arr[i])){
				result[0] = test.get(target-arr[i]);
				result[1] = i;
				break;
			}
		}
		return result;
	}

}
