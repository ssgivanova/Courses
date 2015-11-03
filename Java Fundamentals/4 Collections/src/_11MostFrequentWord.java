import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _11MostFrequentWord {
	
//	Write a program to find the most frequent word in a text and print it, 
//	as well as how many times it appears in format "word -> count". 
//	Consider any non-letter character as a word separator. 
//	Ignore the character casing. If several words have the same maximal frequency, 
//	print all of them in alphabetical order.

	public static void main(String[] args) {
		
		Map<String,Integer> wordsAppearance = new HashMap<String,Integer>();
		int count = 0;
		Integer maxCount = 0;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text :");
		
		String input = sc.nextLine().toLowerCase();
		Pattern pattern = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = pattern.matcher(input);
		while(matcher.find()){
			String currentWord = matcher.group();
			//non existing word
			if(!wordsAppearance.containsKey(currentWord)){
				wordsAppearance.put(currentWord, 0);
			}
			//put a new word in the map
			count = wordsAppearance.get(currentWord);
			wordsAppearance.put(currentWord,count+1);
			
			if( wordsAppearance.get(currentWord) > maxCount){
				maxCount = wordsAppearance.get(currentWord);
			}
		}
				
		for (Map.Entry<String, Integer> entryWord : wordsAppearance.entrySet()) {
			if (entryWord.getValue()==maxCount){
				System.out.printf("%s -> %d times%n",entryWord.getKey(),entryWord.getValue());
			}
		}
	}

}
