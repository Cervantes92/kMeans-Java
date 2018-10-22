package kMeans.kMethods;

import kMeans.fieldMetrics.fieldMetrics;

public class kMethods {
	
	/*
	 * Returns a 2d array, where the first value represents the index of the
	 * point in the cluster field and the second represents the index of the
	 * center given point belongs to.
	 */
	public static int[][] kMeans(double[][] clusterField, int numberOfClusters, double stability) {
		fieldMetrics metrics = new fieldMetrics(clusterField);
		
		//Set size of cluster field.
		double minx = metrics.getMinXValue(), miny = metrics.getMinYValue(), 
				maxx = metrics.getMaxXValue(), maxy = metrics.getMaxYValue();
		
		//relation array expressing which point is related to what cluster
		int[][] relations = new int[clusterField.length][clusterField[0].length];
		
		double[][] centers;
		double delta;
		
		do {
			//Calculate change in center positions.
			delta = 0;
			
		}
		while(delta > stability);
		
		
		return relations;
	}
}
