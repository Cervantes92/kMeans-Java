package kMeans;

import kMeans.parser.Parser;

public class Launcher {
	
	public static void main(String[] args) {
		String centers = Parser.loadFileAsString("src/cluster-samples/cent.csv");
		System.out.println(centers);
	}

}
