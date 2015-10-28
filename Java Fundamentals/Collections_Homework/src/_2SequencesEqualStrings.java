import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class _2SequencesEqualStrings {
	
//	Write a program that enters an array of strings and finds in it 
//	all sequences of equal elements. 
//	The input strings are given as a single line, separated by a space. 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter words :");
		String [] words = sc.nextLine().split(" ");	
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			System.out.print(word);
			for (int j = i+1; j < words.length; j++) {
				String nextWord = words[j];
				if (nextWord.equals(word)){
					System.out.print(" "+ words[j]);
					i++;
				}				
			}
			System.out.println();
		}
		
//		HashMap <String,Integer> wordsCount = new HashMap<String, Integer>();
//		String word;
//		Integer count;
//		for (int i = 0; i < words.length; i++) {
//			word = words[i];
//			count = wordsCount.get(word);
//			if(count == null) {
//				count = 0;
//			}			
//			wordsCount.put(word, count+1);
//		}
		
//		print words repetions
//		Iterator<String> iterator = wordsCount.keySet().iterator();
//		while(iterator.hasNext()){
//			String key = iterator.next();
//			System.out.println(key+" - > "+ wordsCount.get(key));
//		}
		
		//print only the keys
						
//		for (String key : wordsCount.keySet()) {
//			int countKey = wordsCount.get(key);
//			for (int i = 0; i < countKey; i++) {
//				System.out.print(key +" ");
//			}
//			System.out.println();
//		}
	}

}
