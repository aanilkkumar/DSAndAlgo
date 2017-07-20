package com.datastructure.ds.stack;

import java.util.Arrays;

public class ResizingArrayImpl {
	private String[] stack;
	private int top = 0;

	public ResizingArrayImpl() {
		stack = new String[1];
	}

	public void push(String str){
		stack[top] = str;
		top++;
		if(top > (stack.length-1)){
			// Think : Push should do only push other work should be delegated!!
			resize(stack.length*2);
		}
		System.out.println("Element pushed:"+ str);
	}

	private void resize(int len) {
		// We need to copy what ? : existing stack : How will you know ? --> by top
		String[] newStack = new String[len];
		for (int i = 0; i < top; i++) {
			newStack[i] = stack[i];
		}
		stack = newStack;
	}
	
	public String pop(){
		if(top == 0){
			return "No element left to pop";
		}
		String popped = stack[--top];
		stack[top] = null;
		//if(top == (stack.length)/2){
		if(top == (stack.length)/4){ // better : Why ?
			resize((stack.length)/2);
		}
		return popped;
	}
	
	public boolean isEmpty(){
		if(top == 0){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "ResizingArrayImpl [stack=" + Arrays.toString(stack) + ", top=" + top + "] and size of array: "+stack.length;
	}
	
	
}
