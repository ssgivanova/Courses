import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilterArray {
	
//	Write a program that filters an array of strings, finds the numbers in it, 
//	and maps them to a list of integers. Sum all
//	the integers and print the result.
	
//	Banica 12 gosho j1k 33 kl bozichka 81 88kl 5562 abcd 8 I te taka

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text and numbers to calculate their sum :");
		
		String [] elements = sc.nextLine().split(" ");
		
		// for java 8
//		List<Integer> numbers = Arrays.streams(elements)
//				.filter(FilterArray::isNumber)
//				.map(Integer::parseInt)
//				.collect(Collectors.toList());
//		
//		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
//		int sum2 = numbers.stream().collect(Collectors.sumingInt(Integer::intValue));
//		int sum3 = numbers.stream().reduce((x,y) -> x+y).get();
		
		int sum = 0;
		for (String element : elements) {
			if (isNumber(element)){
				int number = Integer.parseInt(element);
				sum += number;
			}
		}
		System.out.println(sum);

	}
	 
	public static boolean isNumber(String str){
		boolean result = true;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return result;
	}

}
