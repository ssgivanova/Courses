package Problem3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountCharacterTypes {
	
//	Write a program that reads a list of words from the file words.txt and finds the count of vowels,
//	consonants and other punctuation marks. Since English is a bit tricky, assume that a, e, i, o, u are vowels
//	and all others are consonants. Punctuation marks are (!,.?). Do not count whitespace.
//	Write the results in file count-chars.txt.
	
	private static final String INPUT_PATHNAME = "src/Problem3/input/words.txt";
	private static final String OUTPUT_PATHNAME = "src/Problem3/input/count-chars.txt";

	public static void main(String[] args) {
		
		File input = new File(INPUT_PATHNAME);
		File ouptut = new File(OUTPUT_PATHNAME);
		
		int vowelsCount = 0;
		int consonnantsCount = 0;
		int punctuationCount = 0;
		
		try(BufferedReader reader = new BufferedReader(new FileReader(input));
			BufferedWriter writer = new BufferedWriter(new FileWriter(ouptut)) ){
			
			String line;
			while((line=reader.readLine()) != null){
				for (char letter : line.toCharArray()) {
					switch(letter){
					case 'a':
					case 'o':
					case 'e':
					case 'i':
					case 'u': vowelsCount ++;break;
					case '?':
					case '.':
					case ',':
					case '!': punctuationCount ++; break;
					case ' ': break;
					default : consonnantsCount ++; break;
					}
				}
			}
			String result = String.format("Vowels: %d%nConsonants: %d%nPunctuation: %d%n", vowelsCount,consonnantsCount,punctuationCount);
			writer.write(result);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
