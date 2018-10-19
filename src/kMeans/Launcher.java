package kMeans;

import java.util.ArrayList;

import kMeans.parser.Parser;

public class Launcher {
	
	public static void main(String[] args) {
		String centers = Parser.loadFileAsString("src/cluster-samples/cent.csv");
		
		//SANITY CHECK
		//System.out.println("Raw string input:");
		//System.out.println(centers);
		
		String[] tokens = Parser.stringSplitsCSV(centers);
		
		//Parse string array into a doubles array
		double[][] points = new double[2][tokens.length];
		System.out.println("i\tx\t\t\ty");
		for(int i = 0; i < tokens.length; i++) {
			if(i % 2 == 0) {
				points[0][i] = Parser.parseDouble(tokens[i]);
				System.out.print(i + points[0][i] + "\t");
			}
			else if(i % 2 != 0) {
				points[1][i] = Parser.parseDouble(tokens[i]);
				System.out.println(points[1][i]);
			}
		}
	}
}
