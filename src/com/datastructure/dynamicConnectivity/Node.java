package com.datastructure.dynamicConnectivity;

import java.util.Objects;

public class Node {
	
	private final int id;
	
	public Node(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || !(obj instanceof Node))
			return false;
		Node other = (Node) obj;
		return Objects.equals(this.id, other.id);
	}

	@Override
	public String toString() {
		return "Node [id=" + id + "]";
	}
	
}
