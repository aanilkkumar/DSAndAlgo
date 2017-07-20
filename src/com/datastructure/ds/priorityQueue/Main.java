package com.datastructure.ds.priorityQueue;

public class Main {

	public static void main(String[] args) {

		PriorityQueueUnsortedArray<Transaction> pq = new PriorityQueueUnsortedArray<>(6);
		
		Transaction t1 = new Transaction("P", 100);
		Transaction t2 = new Transaction("Q", 102);
		Transaction t3 = new Transaction("E", 190);
		Transaction t4 = new Transaction("X", 150);
		
		
		pq.insert(t1);
		pq.insert(t2);
		pq.insert(t3);
		pq.insert(t4);
		
		
//		System.out.println("Before del");
//		for (Transaction transaction : pq) {
//			System.out.println(transaction);
//		}

		//		Iterator<Transaction> transactionInPQ = pq.iterator();
//		while(transactionInPQ.hasNext()){
//			System.out.println(transactionInPQ.next());
//		}

		Transaction t5 = new Transaction("A", 10);
		Transaction t6 = new Transaction("B", 1000);
		
		pq.insert(t5);
		pq.insert(t6);
		
		if (pq.size() > 5) {
			pq.deleteMax();
		}
		
		System.out.println("After del");
		for (Transaction transaction : pq) {
			System.out.println(transaction);
		}

	}
}
