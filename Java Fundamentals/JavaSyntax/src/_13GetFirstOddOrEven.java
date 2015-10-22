import java.util.Scanner;


public class _13GetFirstOddOrEven {

	//Write a method that returns the first N odd/even elements from a collection. 
	//Return as many as you can.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert some numbers: ");
		String [] nbrs = sc.nextLine().split(" ");
		int [] numbers = new int[nbrs.length];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(nbrs[i]);
		}
		
		System.out.println("Get how many odd / even ?");
		String[] phrase = sc.nextLine().split(" ");
		int n = Integer.parseInt(phrase[1]);
		String OddEven = phrase[2];
		
		for (int i = 0; i < numbers.length; i++) {
			if (OddEven.equals("odd")){
				if(numbers[i] % 2 != 0){
					System.out.print(numbers[i]+" ");
				}
			}else if (OddEven.equals("even")){
				if(numbers[i] % 2 == 0){
					System.out.print(numbers[i]+" ");
				}
			}
			if (i > n){
				break;
			}
		}
	}

}
