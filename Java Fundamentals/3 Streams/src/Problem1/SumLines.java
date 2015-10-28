package Problem1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
	
	private static final String PATHNAME = "src/Problem2/input/lines.txt";
	
//	Write a program that reads a text file and prints on the console 
//	the sum of the ASCII symbols of each of its lines. Use
//	BufferedReader in combination with FileReader.

	public static void main(String[] args) {
		
		int asciiSum =0;

		try (BufferedReader reader = new BufferedReader(new FileReader(PATHNAME))){
			String line;
			while ((line = reader.readLine()) != null){
				for (int i = 0; i < line.length(); i++) {
					asciiSum += line.charAt(i);
				}
			}
			System.out.println(asciiSum);
		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
