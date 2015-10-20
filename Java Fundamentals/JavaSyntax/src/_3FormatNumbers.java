import java.util.Locale;
import java.util.Scanner;


public class _3FormatNumbers {

//	Write a program that reads 3 numbers: an integer a 􀍾0 ≤ a ≤ 500􀍿, a floating-point b and a floating-point c and prints
//	them in 4 virtual columns on the console. Each column should have a width of 10 characters. The number a should
//	be printed in hexadecimal, left aligned; then the number a should be printed in binary form, padded with zeroes,
//	then the number b should be printed with 2 digits after the decimal point, right aligned; the number c should be
//	printed with 3 digits after the decimal point, left aligned.
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 number - 1 positive integer and 2 floating-point :");
		
		short a = sc.nextShort();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.printf("|%-10X|",a);		
		System.out.print(String.format("%10s",Integer.toBinaryString(a)).replace(' ', '0'));
		System.out.printf("|%10.2f|%-10.3f|",b,c);
	}

}
