package com.datastructure.dynamicConnectivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	static Node n0 = new Node(0);
	static Node n1 = new Node(1);
	static Node n2 = new Node(2);
	static Node n3 = new Node(3);
	static Node n4 = new Node(4);
	static Node n5 = new Node(5);
	static Node n6 = new Node(6);
	static Node n7 = new Node(7);
	static Node n8 = new Node(8);
	static Node n9 = new Node(9);
	static Node n10 = new Node(10);
	static Node n11 = new Node(11);
	
	private static Map<Node, List<Node>> map = new HashMap<>();
	
	public static void main(String[] args){	
		
		// OO Approach
		UnionAndFind unionAndFind = new UnionAndFind();
		unionAndFind.union(n1, n2);
//		System.out.println("Does 1 and 2 are connected :" +unionAndFind.isConnected(n1, n2));
//		System.out.println("Map: " +unionAndFind.toString());
		
		System.out.println("==========================================================");
		
		// OO : Quick Find
		
		QuickFind unionAndFindArrayImpl = new QuickFind(9);
		unionAndFindArrayImpl.union(4, 5);
		unionAndFindArrayImpl.union(0, 1);
		unionAndFindArrayImpl.union(1, 4);
		unionAndFindArrayImpl.union(7, 8);
		unionAndFindArrayImpl.union(1, 8);
		
//		System.out.println("Graph :" +unionAndFindArrayImpl.toString());
//		System.out.println("Does 1 and 5 are connected :" +unionAndFindArrayImpl.isConnected(1, 5));
//		System.out.println("Does 1 and 8 are connected :" +unionAndFindArrayImpl.isConnected(1, 8));
		
		System.out.println("==========================================================");
		
		// OO : Quick Union
		
		QuickUnion quickUnion = new QuickUnion(9);
		quickUnion.union(1,2);
		quickUnion.union(1,3);
		quickUnion.union(6,8);
		quickUnion.union(3,8);
		
		System.out.println("QU Graph :" +quickUnion.toString());
		System.out.println("Does 1 and 8 are connected :" + quickUnion.isConnected(1, 8));
		System.out.println("Does 0 and 5 are connected :" + quickUnion.isConnected(0, 5));
		
		// Procedural Approach
		createMap();
		printMap();
		//System.out.println("Does 0 and 9 are connected :" + isConnected(n0, n9));
	}

	private static void createMap() {
		union(n0, n1);
		union(n0, n5);
		union(n1, n2);
		union(n2, n10);
		union(n2, n11);
		union(n5, n6);
		union(n6, n7);
		
		//union(n2, n3);
		union(n3, n4);
		union(n3, n8);
		union(n4, n9);
	}

	private static void union(Node n1, Node n2){
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

	private static boolean isConnected(Node n1, Node n2){
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
	
	private static boolean isPresentInSubTree(Node node, Node n2) {
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

	private static void printMap() {
		for (Map.Entry<Node, List<Node>> entry: map.entrySet()) {
			System.out.println("Node: "+ entry.getKey() +" Value: "+entry.getValue());
		}
	}

}
