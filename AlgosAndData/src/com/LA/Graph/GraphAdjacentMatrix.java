package com.LA.Graph;

import java.util.List;

public class GraphAdjacentMatrix extends Graph {
	
	private int [][] adjMatrix;

	@Override
	public void implementAddVertex() {
		// TODO Auto-generated method stub
		
	}
	
	public void implementAddEdge(int v, int w) {
		adjMatrix [v][w] = 1;
	}

	@Override
	public List<Integer> getNeighbours(int v) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
