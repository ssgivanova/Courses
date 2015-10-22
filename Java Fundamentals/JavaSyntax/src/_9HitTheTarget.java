import java.util.Scanner;


public class _9HitTheTarget {

	//  *
	//Write a program that takes as input an integer – the target – and outputs to the console all pairs of numbers
	//between 1 and 20, which, if added or subtracted, result in the target.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target ");
		int target = sc.nextInt();
		int max =20;
		
		for (int i = 1; i <= max; i++) {
			for (int j = 0; j < max; j++) {
				if(i + j == target){
					System.out.printf("%d + %d = %d%n",i,j,target);
				}
				if(i - j == target  ){
					System.out.printf("%d - %d = %d%n",i,j,target);
				}
			}
		}
	}
}
