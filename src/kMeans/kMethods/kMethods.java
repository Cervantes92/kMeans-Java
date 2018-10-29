package kMeans.kMethods;

import kMeans.fieldMetrics.fieldMetrics;

public class kMethods {
	
	/*
	 * This is the main algorithm in kMeans clusters.
	 */
	public static double[][] kMeans(double[][] clusterField, int numberOfClusters, double stability) {
		fieldMetrics metrics = new fieldMetrics(clusterField);
		
		//Declare loop indexes to work around nested loop index declaration issue. How could this go wrong?
		int i;
		int j;
		
		//Set size of cluster field.
		double minx = metrics.getMinXValue(), miny = metrics.getMinYValue(), 
				maxx = metrics.getMaxXValue(), maxy = metrics.getMaxYValue();
		//System.out.println("minX: " + minx + "\nmaxX: " + maxx + "\nminY: " + miny + "\nmaxY: " + maxy);
				
		//Array to store the change in the center.
		double[] delta = new double[numberOfClusters];
		
		//relation array expressing which point is related to what cluster
		int[] relations = new int[clusterField[0].length];
		
		//first guess for centers
		double[][] centers = new double[2][numberOfClusters];
		
		//Draw a line of potential centers across the field
		//TODO: Have the initial conditions scale with the cluster field space.
		double m = ((maxx - minx) / (maxy - miny));
		for(i = 0; i < centers[0].length; i++) {
			centers[0][i] = m * i / centers[0].length + minx;
			centers[1][i] = m * i / centers[0].length + miny;
		}
		
		//Store previous centers to check for stability.
		double[][] centersOld = centers;
		
		//index of distances from points to centers
		double[][] distances = new double[clusterField[0].length][numberOfClusters];
		
		//Store smallest distance.
		double[] smallestDistance = new double[clusterField[0].length];
		
		//TODO: Check null in algorithm's main loop. IDE bug prevents checking for null values in a doubles array.
		for(i = 0; i < clusterField[0].length; i++) {
			for(j = 0; j < centers[0].length; j++) {
				smallestDistance[i] = calculateDistance(clusterField[0][i],clusterField[1][i],centers[0][j],centers[1][j]);
			}
		}
		
		//Variables for calculating the average.
		double sumx = 0;
		double sumy = 0;
		double num = 0; //Double to avoid any rounding errors.
		
		//Main algorithm loop
		do {
			
			/*Assign each point it's nearest center. NOTE: here is what is happening. All three potential centers are
			 *being assigned the same point. I must implement a check to ensure that each point is only assigned one
			 *center.
			 */
			
			System.out.println("Distance calc: ");
			for(i = 0; i < clusterField[0].length; i++) {
				for(j = 0; j < centers[0].length; j++) {
					
					//calculate the distance between each point and each center;
					distances[i][j] = calculateDistance(clusterField[0][i],clusterField[1][i],centers[0][j],centers[1][j]);
					
					//Diagnostics
					System.out.println(distances[i][j]);
					
					//Store the index of the closest center.
					if(distances[i][j] < smallestDistance[i]) {
						smallestDistance[i] = distances[i][j];
						relations[i] = j;
					}
				}
				
				//Diagnostics
				System.out.println();
				System.out.println("Relations[pointIndex] = centerIndex: ");
				for(i = 0; i < relations.length; i++) {
					System.out.println(i + " : " + relations[i]);
				}
				System.out.println();
				
				//Set the new centers. IDE doesn't recognize that j has already been declared.
				for(j = 0; j < centers[0].length; j++) {
					sumx = 0;
					sumy = 0;
					num = 0;
					
					for(i = 0; i < clusterField[0].length; i++) {
						
						//Check if the point is assigned to the cluster.
						if(relations[i] == j) {
							//add to running sum
							sumx += clusterField[0][i];
							sumy += clusterField[1][i];
							num += 1;
						}
					}
					
					//Set the new center to the average.
					for(int thing = 0; thing < centers[0].length; thing++) {
						centersOld[0][thing] = centers[0][thing];
						centersOld[1][thing] = centers[1][thing];
					}
					
					centers[0][j] = sumx / num;
					centers[1][j] = sumy / num;
					
					//calculate delta
					delta[j] = deltaCalc(centers[0][j], centers[1][j], centersOld[0][j], centersOld[1][j]);
					
				}
			}
		}
		
		while(sumArray(delta) > stability);
		
		
		return centers;
	}
	
	private static double calculateDistance(double x1, double y1, double x2, double y2) {
		return Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
	}
	
	private static double sumArray(double[] someArray) {
		double sum = 0;
		for(int i = 0; i < someArray.length; i++)
			sum += someArray[i];
		return sum;
	}
	
	private static double deltaCalc(double x1, double y1, double x2, double y2) {
		double delta = ((x2 - x1) + (y2 - y1)) / 2;
		return Math.abs(delta);
	}
}
