package com.datastructure.dynamicConnectivity;

import java.util.List;
import java.util.Map;


public interface IUnionAndFind {
	
	public void setMap();
	
	public Map<Node, List<Node>> getMap();
	
	public void union(Node n1, Node n2);
	
	public boolean isConnected(Node n1, Node n2);
}
