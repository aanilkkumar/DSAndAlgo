package com.datastructure.annotaion;

public class ChildClass extends BaseClass{

	// @Override tells the compiler that this method is an overridden method
	// (metadata about method) and if any such method does not exist in parent class, 
	// then throw a compiler error (method does not override a method from its super class)
	@Override
	public String whyAnnotate(){
		return "parent Class";
	}
	
	public int whyAnnotate(int num){
		return 3;
	}

}
