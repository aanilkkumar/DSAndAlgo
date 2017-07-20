package com.datastructure.dynamicConnectivity;

import java.util.Arrays;

public class QuickUnion {
	
	private final int[] graphNodesIds;
	private final int[] size;
	
	public QuickUnion(int n) {
		graphNodesIds = new int[n];
		size = new int[n];
		for(int i=0; i<n; i++){
			graphNodesIds[i] = i;
		}
		for(int i=0; i<n; i++){
			size[i] = 0;
		}
	}
	
	public void union(int n1, int n2){
		graphNodesIds[rootOf(n1)] = rootOf(n2);
	}

	private int rootOf(int n1) {
		while(graphNodesIds[n1] != n1){
			n1 = graphNodesIds[n1];
		}
		return n1;
	}

	public boolean isConnected(int n1, int n2){
		return rootOf(n1) == rootOf(n2);
	}
	
	@Override
	public String toString() {
		return "QuickUnion [graph=" + Arrays.toString(graphNodesIds) + "]";
	}
}
