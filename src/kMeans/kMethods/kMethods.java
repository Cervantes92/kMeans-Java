package kMeans.kMethods;

import kMeans.fieldMetrics.fieldMetrics;

public class kMethods {
	
	/*
	 * Here we will express the relations as an array which indexes which point is closest to which
	 * center.
	 */
	public static int[] kMeans(double[][] clusterField, int numberOfClusters, double stability) {
		fieldMetrics metrics = new fieldMetrics(clusterField);
		
		//Set size of cluster field.
		double minx = metrics.getMinXValue(), miny = metrics.getMinYValue(), 
				maxx = metrics.getMaxXValue(), maxy = metrics.getMaxYValue();
				
		//How far the point moves.
		double delta;
		
		//relation array expressing which point is related to what cluster
		int[] relations = new int[clusterField[0].length];
		

		
		//first guess for centers
		double[][] centers = new double[2][numberOfClusters];
		
		//Draw a line of potential centers across the field
		double m = ((maxx - minx) / (maxy - miny));
		for(int i = 0; i < centers[0].length; i++) {
			centers[0][i] = m * i / centers.length + minx;
			centers[1][i] = m * i / centers.length + miny;
		}
		
		//Store previous centers to check for stability.
		double[][] centersOld = centers;
		
		//index of distances from points to centers
		double[][] distances = new double[clusterField[0].length][numberOfClusters];
		
		//Store smallest distance.
		double[] smallestDistance;
		
		//TODO: Check null in algorithm's main loop. IDE bug prevents checking for null values in a doubles array.
		for(int i = 0; i < clusterField[0].length; i++) {
			for(int j = 0; j < centers[0].length; j++) {
				smallestDistance[i] = distances[i][j];
			}
		}
		
		do {
			//Assign each point it's nearest center.
			for(int i = 0; i < clusterField[0].length; i++) {
				for(int j = 0; j < centers[0].length; j++) {
					//calculate the distance between each point and each center;
					distances[i][j] = calculateDistance(clusterField[0][i],clusterField[1][i],centers[0][j],centers[1][j]);
					
					//Store the smallest distance for the 
					
					//Store the index of the closest center. TODO: null check should go here!
					if(distances[i][j] < smallestDistance[i] || smallestDistance[i] == null) {
						
					}
					
				}
			}
			//Calculate change in center positions.
			delta = 0;
			
		}
		while(delta > stability);
		
		
		return relations;
	}
	
	public static double calculateDistance(double x1, double y1, double x2, double y2) {
		return Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
	}
}
