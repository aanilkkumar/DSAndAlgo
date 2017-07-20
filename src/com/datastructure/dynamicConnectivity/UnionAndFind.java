package com.datastructure.dynamicConnectivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnionAndFind {
	
	private final Map<Node, List<Node>> map = new HashMap<>();
	
//	public UnionAndFind(Map<Node, List<Node>> map) {
//		// Problem say : 1. Able to union . 2. Able to check if 2 node are connected.
//		// Constructor Not needed. Its up to me which DS I want to use.
//		this.map = map;
//	}

	public void union(Node n1, Node n2){
		if(null != map.get(n1)){
			if(!map.get(n1).contains(n2)){
				map.get(n1).add(n2);
			}
		}
		else{
			List<Node> links = new ArrayList<>();
			links.add(n2);
			map.put(n1, links);
		}
	}

	public boolean isConnected(Node n1, Node n2){
		List<Node> links = map.get(n1);
		for (Node node : links) {
			if(node.equals(n2)){
				return true;
			}
		}
		for (Node node : links) {
			if(isPresentInSubTree(node, n2)){
				return true;
			}
		}
		return false;
	}
	
	private boolean isPresentInSubTree(Node node, Node n2) {
		List<Node> links = map.get(node);
		for (Node node1 : links) {
			if(node1.equals(n2)){
				return true;
			}
			else{
				if(null != map.get(node1)){
					boolean isPresent = isPresentInSubTree(node1, n2);
					if(isPresent){
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		for (Map.Entry<Node, List<Node>> entry: map.entrySet()) {
			System.out.println("Node: "+ entry.getKey() +" Value: "+entry.getValue());
		}
		return "UnionAndFind [map=" + map + "]";
	}
	
}


//While defining a interface whose concrete implementation is intended to have List as data member (or any other ) , we should define the setter method in the interface, so that the implementor of the interface is binded/ forced to set the List.
//So that the implementor of the interface can set the list and the getter will gurantee that it will return the same list.