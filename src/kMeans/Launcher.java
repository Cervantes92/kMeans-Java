package kMeans;

import java.util.ArrayList;

import kMeans.parser.Parser;

public class Launcher {
	
	public static void main(String[] args) {
		String centers = Parser.loadFileAsString("src/cluster-samples/cent.csv");
		
		//ArrayList<String> means = new ArrayList<>();
		//means = Parser.loadFileAsArrayList("src/cluster-samples/cent.csv");
		
		System.out.println("Raw string input:");
		System.out.println(centers);
		
		//System.out.println("ArrayList output");
		//System.out.println(means);
		
		
		String[] tokens = Parser.stringSplitsCSV(centers);
		
		System.out.println("Tokens after splitting: ");
		for(int i = 0; i < tokens.length; i++) {
			System.out.println(i + ": " + tokens[i]);
		}
	}

}
