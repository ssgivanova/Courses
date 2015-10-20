import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _10ExtractWords {

	//Write a program that extracts words from a string. Words are sequences of characters that are at least two symbols
	//long and consist only of English alphabet letters. Use regex.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String text = sc.nextLine();
	
		Pattern pattern = Pattern.compile("[a-z A-Z]{2,}");
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()){
			System.out.print(matcher.group()+" ");
		}
	}
}
