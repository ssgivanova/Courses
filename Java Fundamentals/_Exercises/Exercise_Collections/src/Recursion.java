import java.util.Scanner;

public class Recursion {
	
//	Print Numbers from 1 to N Using Recursion

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		
		System.out.println("In descending order : ");
		printRecursiveDescending(n);
		System.out.println("In ascending order : ");
		printRecursiveAscending(n);
		
	}
	
	public static void printRecursiveDescending(int n){
		if (n<1){
			return;
		}
		System.out.println(n);
		printRecursiveDescending(n-1);
	}
	public static void printRecursiveAscending(int n){
		if (n<1){
			return;
		}
		printRecursiveAscending(n-1);
		System.out.println(n);
	}

}
