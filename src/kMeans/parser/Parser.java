package kMeans.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parser {
	String line = "/n";
	String splitBy = ",";

	public static String loadFileAsString(String path) {
		StringBuilder builder = new StringBuilder();
		
		try {
			BufferedReader  br = new BufferedReader(new FileReader(path));
			String line;
			while((line = br.readLine()) != null)
				builder.append(line + "\n");
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return builder.toString();	
	}
	
	public static double parseDouble(String number) {
		try {
			return Double.parseDouble(number);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
