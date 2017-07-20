package com.datastructure.ds.stack;

public class Book {
	
	private String name;
	private String writer;
	
	public Book(String name, String writer) {
		this.name = name;
		this.writer = writer;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", writer=" + writer + "]";
	}

}
