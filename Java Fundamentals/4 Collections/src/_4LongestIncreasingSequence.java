import java.util.Scanner;

public class _4LongestIncreasingSequence {
	
//	Write a program to find all increasing sequences inside an array of integers. 
//	The integers are given in a single line, separated by a space. 
//	Print the sequences in the order of their appearance in the input array, 
//	each at a single line. Separate the sequence elements by a space. 
//	Find also the longest increasing sequence and print it at the last line. 
//	If several sequences have the same longest length, print the leftmost of them

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter words :");		
		String [] elements = sc.nextLine().split(" ");
		int [] numbers = new int[elements.length];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(elements[i]);
		}
		
		
		int maxCount = 1;
		int startIndex = 0;
		int currentIndex;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			currentIndex = i;
			int count = 1;
			for (int j = i+1; j < numbers.length; j++) {
				
				if (numbers[j] > numbers[i]){
					System.out.print(" " + numbers[j]);
					count ++;
				}else{
					break;
				}
				i++;
			}
			if (count > maxCount){
				maxCount = count;
				startIndex = currentIndex;
			}
			System.out.println();
		}
		System.out.print("Longest increasing sequence :");
				
		for (int i = startIndex; i < startIndex + maxCount; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
