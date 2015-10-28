import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _14SortArrayStreamAPI {
	
	//Use the .sorted() method to sort an array of integers. 
	//The first line of input is the array. The second is the sorting order.

	public static void main(String[] args){
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter some strings :");
		String[] input = sc.nextLine().split(" ");
		
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			numbers.add(Integer.parseInt(input[i]));
		}
			
		System.out.println("Enter order - ascending / descending :");	
		String order = sc.next().toLowerCase();
		
		if(order.equals("ascending")){
			numbers.stream()
			        .sorted((n1,n2) -> n1.compareTo(n2))
			        .forEach(n -> System.out.println(n) + " ");
		}else if(order.equals("descending")){
			numbers.stream()
	        	   .sorted((n1,n2) -> n2.compareTo(n1))
	        	   .forEach(n -> System.out.println(n) + " ");
		}else{
			System.out.println("Invalid order");
		}
	}
}
