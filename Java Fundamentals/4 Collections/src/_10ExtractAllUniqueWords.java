import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _10ExtractAllUniqueWords {
	
//	At the first line at the console you are given a piece of text. 
//	Extract all words from it and print them in alphabetical order. 
//	Consider each non-letter character as word separator. 
//	Take the repeating words only once. Ignore the character casing. 
//	Print the result words in a single line, separated by spaces

	public static void main(String[] args) {
		
		Set<String> uniqueWords = new TreeSet<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text :");
		String [] words = sc.nextLine().toLowerCase().split("\\W+");
		for (String word : words) {
			uniqueWords.add(word);
		}
		
//		solution with regex
//		String input = sc.nextLine().toLowerCase();
//		Pattern pattern = Pattern.compile("\\w+");
//		Matcher matcher = pattern.matcher(input);
//		
//		while(matcher.find()){
//			uniqueWords.add(matcher.group());
//		}
				
		System.out.println("Unique words in alphabetical order :");
		for (String word : uniqueWords) {
			System.out.print(word + " ");
		}
	}

}
