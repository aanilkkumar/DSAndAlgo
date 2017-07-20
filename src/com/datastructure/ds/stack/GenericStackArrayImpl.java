package com.datastructure.ds.stack;

public class GenericStackArrayImpl<T> {
	
	private T[] stack;
	private int top = 0;

	public GenericStackArrayImpl(int capacity) {
		//stack = new T[capacity]; Java does not allow creation of generic array.	
		stack = (T[]) new Object[capacity];
	}

	public void push(T str){
		if(top > (stack.length-1)){
			System.out.println("No space left");
			return;
		}
		stack[top] = str;
		top++;
		System.out.println("Element pushed:"+ str);
	}
	
	public T pop(){
		if(top == 0){
			return null;
		}
		T popped = stack[--top];
		stack[top] = null;
		return popped;
	}
	
	public boolean isEmpty(){
		if(top == 0){
			return true;
		}
		return false;
	}
}
