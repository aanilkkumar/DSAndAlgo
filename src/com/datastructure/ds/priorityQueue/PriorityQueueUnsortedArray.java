package com.datastructure.ds.priorityQueue;

import java.util.Iterator;

import com.datastructure.sorting.util.SortingUtil;

public class PriorityQueueUnsortedArray<T extends Comparable<T>> implements Iterable<T>{

	// Unordered Array Impl:
	
	private T[] pQueueArry;
	// how to check how many items are there in PQueue.
	private int N;
	
	public PriorityQueueUnsortedArray(int capacity) {
		pQueueArry = (T[]) new Comparable[capacity];
	}

	public T deleteMax() {
		int max = 0;
		for (int i = 0; i < pQueueArry.length; i++) {
			if(SortingUtil.less(pQueueArry[max] , pQueueArry[i])){
				max = i;
			}
		}
		SortingUtil.exchange(pQueueArry, max, N-1);
		return pQueueArry[--N];
	}

	public void insert(T item) {
		pQueueArry[N++] = item;
		
	}

	public int size() {
		return N;
	}
	
	public boolean isEmpty(){
		return N == 0;
	}

	@Override
	public Iterator<T> iterator() {
		return new PriorityQueueIterator();
	}
	
	private class PriorityQueueIterator implements Iterator<T>{

		@Override
		public boolean hasNext() {
			return N != 0;
		}

		@Override
		public T next() {
			// Caveat: it will empty the array when u do foreach : N will become 0 where as will have the data. 
			// How willl you handle it.
			return pQueueArry[--N];
		}

		@Override
		public void remove() {
			
		}

	}
	
}
