package kMeans;

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
		
	}
}
