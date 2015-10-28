import java.util.Scanner;


public class _5ConvertDecimalToBase7 {

	//Write a program that takes an integer number and converts it to base-7
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insert integer number ");
		int n = sc.nextInt();
		System.out.println(Integer.toString(n, 7));
	}

}
