import java.util.Scanner;


public class _8OddEvenPairs {

	//  *
	//You are given an array of integers as a single line, separated by a space. Write a program that checks consecutive
	//pairs and prints if both are odd/even or not. Note that the array length should also be an even number   
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some numbers :");
		
		String[] numbers = sc.nextLine().split(" ");
		
		if(numbers.length % 2 != 0){
			System.out.println("Invalid length");
		}else{
			for (int i = 0; i < numbers.length - 1; i+=2) {
				int n1 = Integer.parseInt(numbers[i]);
				int n2 = Integer.parseInt(numbers[i+1]);
				if(n1 % 2 == 0 && n2 % 2 == 0){
					System.out.printf("%d, %d -> both are even\n",n1,n2);
				}
				else if(n1 % 2 != 0 && n2 % 2 != 0){
					System.out.printf("%d, %d -> both are odd\n",n1,n2);
				}
				else {
					System.out.printf("%d, %d -> different\n",n1,n2);
				}
			}
		}
	}

}
