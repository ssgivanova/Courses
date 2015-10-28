import java.util.Scanner;


public class _4CalculateExpression {
	
	//Write a program that reads three floating point numbers from the console and calculates their result with the formulae
	//Then calculate the difference between the average of the three numbers and the average of the two formulae.
	//Average (a, b, c) – Average (f1, f2)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 floating point numbers : a, b, c");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double formula1 = Math.pow((a*a + b*b)/(a*a - b*b),((a+b+c)/Math.sqrt(c)));
		double formula2 = Math.pow((a*a+b*b-c*c*c),(a-b));
		
		double res1 = getAverage(a, b, c);
		double res2 = getAverage(formula1,formula2);
		double diff = Math.abs(res1 - res2);
		
		System.out.printf("F1 Result : %.2f",formula1);
		System.out.printf(" F2 Result : %.2f",formula2);
		System.out.printf(" Diff Result : %.2f",diff);
	}
	
	public static double getAverage(double a, double b, double c){
		return (a+b+c)/3;
	}
	
	public static double getAverage(double a, double b){
		return (a+b)/2;
	}

}
