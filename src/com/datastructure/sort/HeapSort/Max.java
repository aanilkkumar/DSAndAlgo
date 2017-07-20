package com.datastructure.sort.HeapSort;

public class Max {
	
	public static void main(String[] args) {
		int a=2000, b=100, c=90000;
		int max = a;
		
		if(b>max){
			max =b;
		}
		if(c>max){
			max =c;
		}

		int maximum =  a > b ? ( a > c ? a : c ) : ( b > c ? b : c ) ;
		System.out.println("max is "+ maximum);
	}
}
