import java.util.Scanner;


public class _6ConvertFromBase7ToDecimal {

	// Write a program that converts from a base-7 number to its decimal representation
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert integer number ");
		int n = Integer.parseInt(sc.next(),7);
		System.out.println(n);
	}
}
