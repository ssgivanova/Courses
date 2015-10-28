import java.util.Scanner;

public class _7CountSubstringOccurrences {
	
//	Write a program to find how many times given string appears in given text as substring. 
//	The text is given at the first input line. 
//	The search string is given at the second input line. 
//	The output is an integer number. Please ignore the character casing.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter text on the first line :");
		String text = sc.nextLine().toLowerCase();
		
		System.out.print("Enter the search string : ");
		String searchString = sc.nextLine();
		
		int count = 0;
			
		for (int i = 0; i < text.length()-searchString.length(); i++) {
			String s = text.substring(i, i+searchString.length());
			if (s.equals(searchString)){
				count ++;
			}
		}
		System.out.println(count);
	}

}
