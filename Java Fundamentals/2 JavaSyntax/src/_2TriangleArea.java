import java.util.Scanner;


public class _2TriangleArea {

//	Write a program that enters 3 points in the plane (as integer x and y coordinates), calculates and prints the area of
//	the triangle composed by these 3 points. Round the result to a whole number. In case the three points do not form
//	a triangle, print "0" as result.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int area = 0;
		
		System.out.println("Enter first point : x, y");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		System.out.println("Enter second point : x, y");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		System.out.println("Enter third point : x, y");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		area = Math.abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2))/2);
		
		System.out.println("Area = "+area);

	}

}
