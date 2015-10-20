import java.util.Random;
import java.util.Scanner;


public class _7RandomizeNumbers {
 
	//Write a program that takes as input two integers N and M, and randomizes the numbers between them. Note that
	//M may be smaller than or equal to N.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 integers, n and m (m<=n)");
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int start, end,random;
		int count = 1;
		
		if (n !=m){
			if (n < m){
				start = n;
				end = m;
			}else{
				start = m;
				end = n;
			}
			count = end-start;
			
			//generate count random numbers 
			System.out.println("Randomized :");
			Random rnd = new Random();
			for (int i = 0; i < count; i++) {
				random = start + rnd.nextInt(end - start);
				System.out.print(random+" ");
			}
		}else{
			System.out.println("Randomized :");
			System.out.println(n);
		}
	}

}
