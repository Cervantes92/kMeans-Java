package kMeans.kMethods;

import java.util.ArrayList;

public class kMethods {
	
	/*
	 * Returns a 2d array, where the first value represents the index of the
	 * point in the cluster field and the second represents the index of the
	 * center given point belongs to.
	 */
	public static int[][] kMeans(Double[][] clusterField, int numberOfClusters, double stability) {
		
		//Calculate size of cluster field.
		double minx = 0, miny = 0, maxx = 10, maxy = 10;
		
		int[][] relations = new int[2][clusterField[0].length];
		
		double delta;
		
		do {
			//Calculate change in center positions.
			delta = 0;
			
		}
		while(delta > stability);
		
		
		return relations;
	}
}
