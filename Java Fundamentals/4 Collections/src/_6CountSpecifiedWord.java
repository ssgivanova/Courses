import java.util.Scanner;

public class _6CountSpecifiedWord {
	
//	Write a program to find how many times a word appears in given text. 
//	The text is given at the first input line. 
//	The target word is given at the second input line.
//	The output is an integer number. Please ignore the character casing.
//	Consider that any non-letter character is a word separator.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] words;
		
		System.out.println("Enter text on the first line :");
		String [] text = sc.nextLine().split("\\W+");
		
		System.out.print("Enter the target word : ");
		String target = sc.nextLine();
		
		int targetCount = 0;
		
		for (int i = 0; i < text.length; i++) {
			if(text[i].equalsIgnoreCase(target)){
				targetCount++;
			}
		}
		
		System.out.println("Target word's count : " + targetCount);
	}

}
