package com.datastructure.sorting.util;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getId() < o.getId()){
			return -1;
		}
		else if(this.getId() > o.getId()){
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
