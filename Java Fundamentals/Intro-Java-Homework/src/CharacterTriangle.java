import java.util.Scanner;


public class CharacterTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		char ch = 'a';
		
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			ch='a';
		}		
		for (int i = number-1; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			ch='a';
		}
	}

}
