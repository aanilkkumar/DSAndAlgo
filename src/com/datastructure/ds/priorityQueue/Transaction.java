package com.datastructure.ds.priorityQueue;

public final class Transaction implements Comparable<Transaction>{

	private final String name;
	private final Integer value;
		
	public String getName() {
		return name;
	}

	public Integer getValue() {
		return value;
	}

	public Transaction(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public int compareTo(Transaction o) {
		return this.value.compareTo(o.value);
	}

	@Override
	public String toString() {
		return "Transaction [name=" + name + ", value=" + value + "]";
	}

}
