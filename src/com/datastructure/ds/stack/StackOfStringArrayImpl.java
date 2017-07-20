package com.datastructure.ds.stack;

public class StackOfStringArrayImpl {

	private String[] stack;
	private int top = 0;

	public StackOfStringArrayImpl(int capacity) {
		stack = new String[capacity];
	}

	public void push(String str){
		if(top > (stack.length-1)){
			System.out.println("No space left");
			return;
		}
		stack[top] = str;
		top++;
		System.out.println("Element pushed:"+ str);
	}
	
	public String pop(){
		if(top == 0){
			return "No element left to pop";
		}
		String popped = stack[--top];
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
