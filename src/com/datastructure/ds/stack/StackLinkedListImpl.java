package com.datastructure.ds.stack;

public class StackLinkedListImpl {

	private Node top;

	public void push(String str) {
		Node newNode = new Node();
		newNode.value = str;
		newNode.next = top;
		top = newNode;
	}

	public String pop() {
		String popped = null;
		if (top == null) {
			System.out.println("Stack is empty!!");
		}
		else {
			popped = top.value;
			top = top.next;
		}
		return popped;
	}

	public boolean isEmpty() {
		return top == null;
	}

	class Node {
		String value;
		Node next;
	}

}
