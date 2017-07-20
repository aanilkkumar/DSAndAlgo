package com.datastructure.sorting.shell;

import com.datastructure.sorting.util.SortingUtil;

public class ShellSort {

	public void sort(Comparable[] arr) {

		int length = arr.length;
		int h = 1;
		while (h < length / 3) { // h = 1, 4 , 13, 40, 121....
			h = 3 * h + 1;
		}
		// for (int i = 0; i < length; i++) {
		// for (int i = h; i > 0;) {
		while (h > 0) {
			System.out.println("h=" + h);
			for (int j = h; j < length; j = j + 1) {
				// Code of insertion sort
				for (int k = j; k > 0; k = k - h) {
					if (SortingUtil.less(arr[k], arr[k - h])) {
						SortingUtil.exchange(arr, k, k - h);
					}
					// Think else
					else {
						break;
					}
				}

			}
			h = h / 3;
		}
		for (int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}
	}
}
