package com.datastructure.ds.stack;

import java.util.Iterator;

public class GenericStack<T> implements Iterable<T>{

	private Node top;
	
	private class Node{
		T value;
		Node next;
	}

	public void push(T str){
		Node newNode = new Node();
		newNode.value = str;
		newNode.next = top;
		top = newNode;
	}

	public T pop(){
		T popped = null;
		if(top == null){
			System.out.println("Stack is empty!!");
		}
		else{
			popped = top.value;
			top = top.next;
		}
		return popped;
	}
	
	public boolean isEmpty(){
		return top == null;
	}

	@Override
	public Iterator<T> iterator() {
		return new GenericStackIterator();
	}
	
	private class GenericStackIterator implements Iterator<T>{

		@Override
		public boolean hasNext() {
			return (top != null);
		}

		@Override
		public T next() {
			Node current = top;
			top = top.next;
			return current.value;
		}

		@Override
		public void remove() {
			
		}
		
	}
}
