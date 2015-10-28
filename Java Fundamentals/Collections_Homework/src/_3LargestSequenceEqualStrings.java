import java.util.Scanner;

public class _3LargestSequenceEqualStrings {
	
//	Write a program that enters an array of strings and finds in it the largest sequence
//	of equal elements. If several sequences have the same longest length, 
//	print the leftmost of them. 
//	The input strings are given as a single line, separated by a space.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter words :");
		String [] words = sc.nextLine().split(" ");	
		int countMax = 1;
		int endIndex = 0;
		int startIndex=0;
		
		for (int i = 0; i < words.length; i++) {
			int countEqual = 1;
			startIndex = i;
			for (int j = i+1; j < words.length; j++) {
				//System.out.printf("arr[%d]=%s ? arr[%d]=%s %n",i,words[i], j,words[j]);
				if (words[j].equals(words[i])){
					countEqual ++;
				}else{
					break;
				}
				i++;
			}
			if (countEqual > countMax){
				countMax = countEqual;
				endIndex = i;
			}
		}
		
		//print the max equal strings
		startIndex = endIndex - countMax +1;		
		
		for (int i = 0; i < countMax; i++) {
			System.out.print(words[startIndex] + " ");
		}
	}
}
