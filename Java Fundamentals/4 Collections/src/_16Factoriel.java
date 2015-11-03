import java.util.Scanner;

public class _16Factoriel {
	
	//Write a program that recursively calculates factorial.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N :");
		
		int n = sc.nextInt();
		long fact = factoriel(n);
		System.out.println(fact);
	}
	
	public static long factoriel(int n){
		if (n == 0 || n == 1 ){
			return 1L;
		}
		
		System.out.println(n);
		return n*factoriel(n-1);
	}
}
