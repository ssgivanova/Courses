import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class _12CardsFrequencies {
	
//	We are given a sequence of N playing cards from a standard deck. The input consists of several cards (face + suit),
//	separated by a space. Write a program to calculate and print at the console the frequency of each card face in
//	format "card_face -> frequency". The frequency is calculated by the formula appearances / N and is expressed in
//	percentages with exactly 2 digits after the decimal point. The card faces with their frequency should be printed in
//	the order of the card face's first appearance in the input. The same card can appear multiple times in the input, but
//	it's face should be listed only once in the output.

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> cardApperance = new LinkedHashMap<String,Integer> ();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N cards' suits and number of appearences :");
		int count = 0;
		String [] cards = sc.nextLine().split(" ");
		
		for (int i = 0; i < cards.length; i++) {
			String cardFace = cards[i].substring(0,cards[i].length()-1);
			
			if(!cardApperance.containsKey(cardFace)){
				cardApperance.put(cardFace, 0);
			}
			count = cardApperance.get(cardFace); 
			cardApperance.put(cardFace, count +1);
		}
		
		for (Map.Entry<String,Integer> cardEntry : cardApperance.entrySet()) {
			System.out.printf("%s -> %.2f%%%n",cardEntry.getKey(), ((double)cardEntry.getValue()/cards.length)*100);
		}
	}

}
