package kMeans.kMethods;

public class Center {
	double x, y;
	int index;

	public Center(double x, double y, int index) {
		this.x = x;
		this.y = y;
		this.index = index;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void move() {
		//Move to average of related points.
	}
}
