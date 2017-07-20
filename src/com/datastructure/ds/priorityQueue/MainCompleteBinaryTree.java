package com.datastructure.ds.priorityQueue;

public class MainCompleteBinaryTree {

	public static void main(String[] args) {


		PrirorityQueueUsingCompleteBinaryTree<Transaction> pq = new PrirorityQueueUsingCompleteBinaryTree<>(6);
		
		Transaction t1 = new Transaction("P", 100);
		Transaction t2 = new Transaction("Q", 102);
		Transaction t3 = new Transaction("E", 190);
		Transaction t4 = new Transaction("X", 150);
		Transaction t5= new Transaction("X", 50);
		
		// TODO : Atibhav: DO it properly
		pq.insert(t1);
		pq.insert(t2);
		pq.insert(t3);
		pq.insert(t4);
		pq.insert(t5);
		
		for (Transaction transaction : pq) {
			System.out.println(transaction);
		}
		
	}
}
