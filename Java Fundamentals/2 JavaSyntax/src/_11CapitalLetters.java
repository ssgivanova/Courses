import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _11CapitalLetters {

//	Write a program that takes as input an array of strings are prints only the words that start and end with capital
//	letter. Words are only strings that consist of English alphabet letters. Use regex.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		
		String [] words = sc.nextLine().split(" ");
		for (String word : words) {
			Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b");
			Matcher matcher = pattern.matcher(word);
			while(matcher.find()){
				System.out.print(matcher.group()+" ");
			}
		}
	}
}
