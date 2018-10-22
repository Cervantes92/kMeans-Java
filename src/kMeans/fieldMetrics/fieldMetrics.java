package kMeans.fieldMetrics;

public class fieldMetrics {
	double minXValue;
	double maxXValue;
	double minYValue;
	double maxYValue;
	
	public fieldMetrics(double[][] clusterField) {
		minXValue = clusterField[0][0];
		minYValue = clusterField[0][0];
		maxXValue = clusterField[0][0];
		maxYValue = clusterField[0][0];
		
		for(int j = 0; j < clusterField.length; j++) {
			for(int i= 0; i < clusterField[0].length; i++) {
				if(clusterField[j][0] > minXValue) minXValue = clusterField[j][0];
				if(clusterField[j][0] > maxXValue) maxXValue = clusterField[j][0];
				if(clusterField[0][i] > minYValue) minYValue = clusterField[0][i];
				if(clusterField[0][i] > maxYValue) maxYValue = clusterField[0][i];
			}
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
