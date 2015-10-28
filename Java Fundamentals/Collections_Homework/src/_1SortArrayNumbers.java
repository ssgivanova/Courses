import java.util.Arrays;
import java.util.Scanner;

public class _1SortArrayNumbers {
	
//	Write a program to enter a number n and n integer numbers and 
//	sort and print them. Keep the numbers in array of
//	integers: int[].

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		
		int n = sc.nextInt();
		int[] numbers = new int[n];
		System.out.printf("Enter %d numbers :",n);
		
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		
		Arrays.sort(numbers);
		
		System.out.println("Sorted numbers :");
		for (int num : numbers) {
			System.out.print(num +" ");
		}

	}

}
