import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class _13FilterArray {
	
	//Write a program that filters an array of strings, leaving only the strings 
	//with length greater than 3 characters. Use .filter()

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter some strings :");
		String [] text = sc.nextLine().split(" ");
		Arrays.asList(text).stream().filter(s -> s.length() > 3).forEach(System.out::println());
		
		
		
	}
}
