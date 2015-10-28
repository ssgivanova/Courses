import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _9CombineListsofLetters {
	
//	Write a program that reads two lists of letters l1 and l2 and combines them: 
//	appends all letters c from l2 to the end of l1, but only when c does not appear in l1.
//	Print the obtained combined list. 
//	All lists are given as sequence of letters separated by a single space, 
//	each at a separate line. 
//	Use ArrayList<Character> of chars to keep the input and output lists.

	public static void main(String [] args ){
		
		List<Character> list1, list2;
		List<Character> output = new ArrayList<Character>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first list of letters :");
		list1 = getListOfLetters(sc.nextLine());
		
		System.out.print("Enter second list of letters  ");
		list2 = getListOfLetters(sc.nextLine());
		
		output.addAll(list1);
		
		for (int i = 0; i < list2.size(); i++) {
			if (!list1.contains(list2.get(i))){
				output.add(list2.get(i));
			}
		}		
		
		for (Character character : output) {
			System.out.print(character +" ");
		}
	}
	
	public static List<Character> getListOfLetters(String line){
		List<Character> list = new ArrayList<Character>();
		char[] letters = line.toCharArray();
		for (char letter : letters){
			if(letter != ' ') {
				list.add(letter);
			}
		}
		return list;
	}
}
