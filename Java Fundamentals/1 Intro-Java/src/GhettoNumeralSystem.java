import java.util.Scanner;


public class GhettoNumeralSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		String num = sc.nextLine();
		
		String result = "";
		
		for (int i = 0; i < num.length(); i++) {
			
			char digit = num.charAt(i);
			String gettoNumber ="";
			
			switch (digit){
				case '0' : gettoNumber="Gee";break;
				case '1' : gettoNumber="Bro";break;
				case '2' : gettoNumber="Zuz";break;
				case '3' : gettoNumber="Ma";break;
				case '4' : gettoNumber="Duh";break;
				case '5' : gettoNumber="Yo";break;
				case '6' : gettoNumber="Dis";break;
				case '7' : gettoNumber="Hood";break;
				case '8' : gettoNumber="Jam";break;
				case '9' : gettoNumber="Mack";break;
				default :gettoNumber="";break;
			}
			result += gettoNumber;
			
		}
		System.out.println(result);
		
		

	}

}
