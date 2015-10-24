package Problem2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AllCapitals {
	
	//Write a program that reads a text file and changes the casing of all letters to upper. 
	//The file should be overwritten.
	
	private static final String PATHNAME = "src/Problem2/input/lines.txt";

	public static void main(String[] args) {
		
		File input = new File(PATHNAME);
		File output = new File(PATHNAME+".tmp");

		try (BufferedReader reader = new BufferedReader(new FileReader(input));
			BufferedWriter writer = new BufferedWriter(new FileWriter(output))){
			String line;
			while ((line = reader.readLine()) != null){
				String lineCapsOn = line.toUpperCase();
				writer.write(lineCapsOn);
				writer.newLine();
			}
		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		if (input.exists()){
			input.delete();
			output.renameTo(input);
		}
	}
}
