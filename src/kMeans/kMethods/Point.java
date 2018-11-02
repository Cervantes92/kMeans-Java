package kMeans.kMethods;

import java.util.ArrayList;

public class Point {
	double x, y;
	
	public Point(double x, double y, ArrayList<Center> clusterCenters) {
		this.x = x;
		this.y = y;
		int nearestCenter = 0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public int findNearestCenter(ArrayList<Center> clusterCenters) {
		//Return index of nearest center
		return 0;
	}
}
