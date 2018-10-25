package kMeans;

import kMeans.kMethods.kMethods;
import kMeans.parser.Parser;

public class Launcher {
	
	public static void main(String[] args) {
		//Load file as string
		String centers = Parser.loadFileAsString("src/cluster-samples/cent.csv");
		
		//SANITY CHECK
		//System.out.println("Raw string input:");
		//System.out.println(centers);
		
		//Break String into lines
		String[] tokens = Parser.stringSplitsCSV(centers);
		
		//Parse string array into a doubles array
		double[][] points = Parser.parseString(tokens);
		
		//Execute kMeans algorithm
		double[][] centerPoints = new double[2][points[0].length];
		centerPoints = kMethods.kMeans(points, 3, 0.1);
		
		//Print out results
		System.out.println("i\t\tx\t\ty");
		for(int j = 0; j < centerPoints[0].length; j++) {
			System.out.println(j + "\t\t" + centerPoints[0][j] + "\t\t" + centerPoints[1][j]);
		}

	}
}
