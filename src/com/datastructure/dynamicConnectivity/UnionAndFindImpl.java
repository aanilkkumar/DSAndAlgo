package com.datastructure.dynamicConnectivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnionAndFindImpl implements IUnionAndFind{

	private Map<Node, List<Node>> map;
	
	@Override
	public void setMap() {
		this.map = new HashMap<>();
	}

	@Override
	public Map<Node, List<Node>> getMap() {
		return this.map;
	}

	@Override
	public void union(Node n1, Node n2) {
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

	@Override
	public boolean isConnected(Node n1, Node n2) {
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

}
