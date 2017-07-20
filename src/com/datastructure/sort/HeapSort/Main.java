package com.datastructure.sort.HeapSort;

public class Main {

	static int[] array = { 1, 3, 7, 4, 6, 5, 2, 8, 9, 10 };
	static int heapSize = 10;

	public static void main(String[] args) {
		// buildheap(10);
		heapSort(10);
		for (int i = 0; i <= 9; i++) {
			System.out.println(array[i]);
		}
	}

	public static void heapSort(int n) {
		buildheap(n);
		// swap root(max) to the last element. Place the root at the correct place so that max can
		// reach to the root.
		for (int i = n - 1; i >= 2; i--) {
			int temp = array[1];
			array[1] = array[i];
			array[i] = temp;
			heapSize = i - 1;
			downHeap(1);
		}
	}

	public static void buildheap(int n) {
		// Its building the heap from bottom to top.
		for (int i = n; i >= 0; i--) {
			downHeap(i);
		}
		// Order : nlogn : but we assumed that downheap will get called h times but here we are
		// building the heap from bottom to top.
		// so downheap will get called 0..1...h times.
		// at a level we have 2^i nodes which has to go h-i height.
		// If we calculate order will be o(n).linear : With a correct analysis nlogn --> n.
	}

	// Check if the element is placed in correct position(proper place) or not (from top to
	// bottom).If not place to the right place in the tree.
	// Once you found the proper of an element terminate.
	public static void downHeap(int index) {
		int max = index;
		if (left(index) < heapSize && array[left(index)] > array[max]) {
			max = left(index);
		}
		if (right(index) < heapSize && array[right(index)] > array[max]) {
			max = right(index);
		}
		if (max != index) {
			// swap array[i] <> array[max]
			int temp = array[index];
			array[index] = array[max];
			array[max] = temp;
			downHeap(max);
		}
		// down heap will get called h times at worst case. so it of o(h) --> o(logn)
	}

	public static int left(int index) {
		return 2 * index;
	}

	public static int right(int index) {
		return 2 * index + 1;
	}

	public static void printTree() {
		for (int i = 0; i <= 9; i++) {
			System.out.println(array[i]);
		}
	}
}

// Sorting problem : can not be solved in less then nlogn
// Heap Sort : Optimally solved the sorting problem

// Based on CompleteBinary tree : all levels are complete except the last one (should be filled form
// left to right)

// We can represent/embed the binary tree in array A[] : how?

// i : index in the array then representing tree in an array
// then l(i) = 2i
// and r(i) 2i+1
// and p(i) floor of i/2

// Heap : every node has value less then or equal to its parent. (Max heap) . There is no ordering
// among child.(BST has)
// HEIGHT OF HEAP IS : maximum number of edges from root to any leaf. Height of heap is order of
// logn.
