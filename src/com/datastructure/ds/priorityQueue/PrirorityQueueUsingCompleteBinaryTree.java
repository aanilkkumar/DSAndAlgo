package com.datastructure.ds.priorityQueue;

import java.util.Iterator;

import com.datastructure.sorting.util.SortingUtil;

public class PrirorityQueueUsingCompleteBinaryTree<T extends Comparable<T>> implements Iterable<T>{

	private T[] pQueueArry;
	// how to check how many items are there in PQueue.
	private int N;
	
	public PrirorityQueueUsingCompleteBinaryTree(int capacity) {
		pQueueArry = (T[]) new Comparable[capacity];
	}
	
	public void insert(T value){
		pQueueArry[++N] = value;
		swim(N);
	}
	
	private void swim(int k){
		// think about bound condition when incrementing / decrem in while loop.
		while(k>1 && (SortingUtil.less(pQueueArry[k/2], pQueueArry[k]))){
			SortingUtil.exchange(pQueueArry, k/2, k);
			k=k/2;
		}
	}
	
//	private void sink(int k){
//		// think about bound condition when incrementing / decrem in while loop.
//		//while((2*k+1)<=N && ((SortingUtil.less(pQueueArry[k], pQueueArry[2*k+1]) || (SortingUtil.less(pQueueArry[k], pQueueArry[2*k]))))){
//		// while((2*k+1)<=N -- > until 1 child there is possbility to exchange!!
//		while((2*k+1)<=N && ((SortingUtil.less(pQueueArry[k], pQueueArry[2*k+1]) || (SortingUtil.less(pQueueArry[k], pQueueArry[2*k]))))){
//			if(SortingUtil.less(pQueueArry[k], pQueueArry[2*k+1])){
//				SortingUtil.exchange(pQueueArry, 2*k+1, k);
//				k = 2*k+1;
//			}
//			else{
//				SortingUtil.exchange(pQueueArry, 2*k, k);
//				k = 2*k;
//			}
//		}
//	}
//	
	public T deleteMax() {
		T max = pQueueArry[1];
		SortingUtil.exchange(pQueueArry, 1, N--);
		sink(1);
		pQueueArry[N+1] = null;
		return max;
		
	}
	
	private void sink(int k){
		// think about bound condition when incrementing / decrem in while loop.
		while(2*k <= N ){
			int j = 2*k;
			// Think of getting bigger child if it exist ?
			if(j < N && SortingUtil.less(pQueueArry[j], pQueueArry[j+1])){
				j = j+1;
			}
			if(SortingUtil.less(pQueueArry[j], pQueueArry[k])) break;
			SortingUtil.exchange(pQueueArry, j, k);
			k = j;
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new PrirorityQueueUsingCompleteBinaryTreeIterator();
	}
	
	public class PrirorityQueueUsingCompleteBinaryTreeIterator implements Iterator<T> {

		@Override
		public boolean hasNext() {
			return N > 0;
		}

		@Override
		public T next() {
			// Caveat: it will empty the array when u do foreach : N will become 0 where as will have the data. 
			// How willl you handle it.
			return pQueueArry[N--];
		}

		@Override
		public void remove() {
			
		}

	}
	
}
