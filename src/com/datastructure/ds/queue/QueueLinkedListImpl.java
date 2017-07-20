package com.datastructure.ds.queue;

public class QueueLinkedListImpl {

	private Node first = null;
	private Node last = null;
		
	public void enque(String value){
		Node newNode = new Node();
		newNode.value = value;
		// Try to minimize the conditions by understanding correctly.
		if(isEmpty()){
			first = newNode;
		}
		else{
			last.next = newNode;			
		}
		last = newNode;
	}

	public String denque(){
		String elementRemoved = null;
		if(!isEmpty()){
			elementRemoved = first.value;
			first = first.next;
		}
		else{
			System.out.println("Queue is empty");
		}
		return elementRemoved;
	}
	
	public void printQueue(){
		Node temp = first;
		while(temp != null){
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public boolean isEmpty(){
		return first == null;
	}

}

class Node{
	String value;
	Node next;
}
