package kMeans.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
	
	//IMPORT FILE METHODS
	public static String loadFileAsString(String path) {
		StringBuilder builder = new StringBuilder();
		String line;
		
		try {
			BufferedReader  br = new BufferedReader(new FileReader(path));
			while((line = br.readLine()) != null) {
				builder.append(line + "/n");
			}			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return builder.toString();
	}
	
	//In case of another regex bug, parse to arrayList.
	public static ArrayList<String> loadFileAsArrayList(String path) {
		ArrayList<String> result = new ArrayList<>();
		String line;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while((line = br.readLine()) != null) {
				result.add(line);
			}
			br.close();			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//PARSE FILE METHOD
	public static double parseDouble(String number) {
		try {
			return Double.parseDouble(number);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	//Parse string array into 2d doubles array
	public static double[][] parseString(String[] tokens, int dimensions) {
		double[][] points = new double[2][tokens.length * dimensions];
		for(int i = 0; i < tokens.length / dimensions; i++) {
			if(i % 2 == 0) {
				points[0][i] = Parser.parseDouble(tokens[i]);
			}
			else if(i % 2 != 0) {
				points[1][i] = Parser.parseDouble(tokens[i]);
			}
		}
		return points;
	}
	
	public static String[] stringSplitsCSV(String str) {
		//SplitBy regex is determined in this statement
		String[] tokens = str.split("[,//n]+");
		return tokens;
	}
	
	public static int countLines(String str) {
		String[] lines = str.split("/r/n|/r|/n");
		return lines.length;
	}
}
