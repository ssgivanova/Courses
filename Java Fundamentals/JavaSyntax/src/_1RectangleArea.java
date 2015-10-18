import java.util.Scanner;

//Write a program that enters the sides of a rectangle (two integers a and b) 
//and calculates and prints the rectangle's area

public class _1RectangleArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle's sides : a, b ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int area = a * b;
		System.out.println("Area = " + area);
		
	}

}
