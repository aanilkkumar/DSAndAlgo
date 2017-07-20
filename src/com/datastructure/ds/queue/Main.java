package com.datastructure.ds.queue;

public class Main {

	public static void main(String[] args) {
		QueueLinkedListImpl linkedListImpl = new QueueLinkedListImpl();
		linkedListImpl.enque("Atibhav");
		linkedListImpl.enque("Sinha");
		linkedListImpl.enque("is");
		linkedListImpl.enque("boy !!");
		linkedListImpl.printQueue();
		
		System.out.println("delete Item: ");
		linkedListImpl.denque();
		linkedListImpl.denque();
		linkedListImpl.printQueue();
		
	}

}
