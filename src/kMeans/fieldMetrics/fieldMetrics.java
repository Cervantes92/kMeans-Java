package kMeans.fieldMetrics;

public class fieldMetrics {
	double minXValue;
	double maxXValue;
	double minYValue;
	double maxYValue;
	
	public fieldMetrics(double[][] clusterField) {
		minXValue = clusterField[0][0];
		minYValue = clusterField[1][0];
		maxXValue = clusterField[0][0];
		maxYValue = clusterField[1][0];
		
		//For a 2d cluster field
		for(int i= 0; i < clusterField[0].length; i++) {
			
			if(clusterField[0][i] < minXValue) minXValue = clusterField[0][i];
			if(clusterField[0][i] > maxXValue) maxXValue = clusterField[0][i];
			
			if(clusterField[1][i] < minYValue) minYValue = clusterField[1][i];
			if(clusterField[1][i] > maxYValue) maxYValue = clusterField[1][i];
		}
	}

	public double getMinXValue() {
		return minXValue;
	}

	public double getMaxXValue() {
		return maxXValue;
	}

	public double getMinYValue() {
		return minYValue;
	}

	public double getMaxYValue() {
		return maxYValue;
	}	
}
