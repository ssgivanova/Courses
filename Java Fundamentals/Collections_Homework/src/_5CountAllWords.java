import java.security.AllPermission;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _5CountAllWords {
	
	//Write a program to count the number of words in given sentence. 
	//Use any non-letter character as word separator

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] words;
		String allText = "";
		int count = 0 ;
		int flag = 0;
		
		System.out.println("Enter text to count :");
		allText = sc.nextLine();
		
		do {
			words = allText.split("\\W+");
			count += words.length;
			if ((allText = sc.nextLine()).equals(""))
				flag = 1;
		}while (flag == 0);
		System.out.println("words : " + count);
	}
}
