package kMeans;

import java.util.ArrayList;

import kMeans.kMethods.Center;
import kMeans.kMethods.Point;
import kMeans.kMethods.kMethods;
import kMeans.parser.Parser;

public class Launcher {
	
	public static void main(String[] args) {
		//Load file as string
		String centers = Parser.loadFileAsString("src/cluster-samples/cent.csv");
		
		//Break String into lines
		String[] tokens = Parser.stringSplitsCSV(centers);
		
		//SANITY CHECK
		//System.out.println("Parsed string input: ");
		//for(int m = 0; m < tokens.length; m++) {
		//	System.out.println(tokens[m]);
		//}
		//System.out.println();
		
		//Parse string array into a doubles array
		double[][] points = Parser.parseString(tokens, 2);
		
		//OBJECT ORIENTED APPROACH
		//Create an array list of centers and points
		ArrayList<Point> clusterPoints = new ArrayList<Point>(points[0].length);
		ArrayList<Center> clusterCenters = new ArrayList<Center>(3);
		//Create instance of point class for every point
		for(int i = 0; i < points[0].length; i++) {
			
		}
		
		//SANITY CHECK
		//System.out.println("Parsed numbers: ");
		//for(int i = 0; i < points[0].length; i++) {
		//	System.out.println(points[0][i] + "\t" + points[1][i]);
		//}
		//System.out.println();
		
		//Execute kMeans algorithm
		//double[][] centerPoints = new double[2][points[0].length];
		//centerPoints = kMethods.kMeans(points, 3, 0);
		
		//Print out results
		//System.out.println("i\t\t\tx\t\t\ty");
		//for(int j = 0; j < centerPoints[0].length; j++) {
		//System.out.println(j + "\t\t" + centerPoints[0][j] + "\t\t" + centerPoints[1][j]);
		//}

	}
}
