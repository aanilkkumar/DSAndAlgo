package com.datastructure.sorting.merge;

public class FactorialMain {

	public static void main(String[] args) {

		System.out.println("factorial of 6 is = "+ factorial(4));
		
	}
	
	private static int factorial(int n){
		if(n==1){
			return 1;
		}
		else{
			System.out.println("done with factorial");
			return n*factorial(n-1);
		}
	}

}
