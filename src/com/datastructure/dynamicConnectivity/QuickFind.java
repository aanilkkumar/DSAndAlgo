package com.datastructure.dynamicConnectivity;

import java.util.Arrays;


public class QuickFind {

	// Instead of initialized give power to the user to init it.
	private int[] graphNodesIds;
	
	public QuickFind(int n) {
		graphNodesIds = new int[n];
		for(int i=0; i<n; i++){
			graphNodesIds[i] = i;
		}
	}
	
	//Connected if they have the same id
	public void union(int n1, int n2){
		if(checkIfNodesAreValid(n1, n2)){
			int n1Id = graphNodesIds[n1];
			int n2Id = graphNodesIds[n2];
			for(int i=0; i<graphNodesIds.length; i++){
				if(graphNodesIds[i] == n2Id){
					graphNodesIds[i] = n1Id;
				}
			}
		}
		else{
			System.out.println("Please provide correct data");
		}
	}

	private boolean checkIfNodesAreValid(int n1, int n2) {
		if(!existInGraph(n1)){
			System.out.println("Node "+n1+" does not exist in graph");
			return false;
		}
		if(!existInGraph(n2)){
			System.out.println("Node "+n2+" does not exist in graph");
			return false;
		}
		return true;
	}

	public boolean isConnected(int n1, int n2){
		if(checkIfNodesAreValid(n1, n2)){
			if(graphNodesIds[n2] == graphNodesIds[n1]){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			System.out.println("Please provide correct data");
		}
		return false;
	}
	
	private boolean existInGraph(int n1) {
		if(n1>=0 && n1<graphNodesIds.length){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "UnionAndFindArrayImpl [graph=" + Arrays.toString(graphNodesIds) + "]";
	}
	
}
