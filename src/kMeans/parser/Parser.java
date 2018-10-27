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
		double[][] points = new double[dimensions][tokens.length / 2];
		double value;
		for(int i = 0; i < tokens.length; i++) {
			value = Parser.parseDouble(tokens[i]);
			
			for(int j = 0; j < tokens.length / dimensions; j++) {
				for(int k = 0; k < dimensions; k++) {
					points[k][j] = Parser.parseDouble(tokens[k + j * dimensions]);
				}
			}
		}
		return points;
	}
	public static double sciNote(String str) {
		double number = 0;
		//Parse out sci note
		
		
		return number;
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
