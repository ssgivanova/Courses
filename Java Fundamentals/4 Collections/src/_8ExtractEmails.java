import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _8ExtractEmails {
	
//	Write a program to extract all email addresses from given text.The text comes at the first input line. 
//	Print the emails in the output, each at a separate line. 
//	Emails are considered to be in format <user>@<host>, where:
//	--> <user> is a sequence of letters and digits, where '.', '-' and '_' can appear between them. 
//	Examples of valid users: 
//	"stephan", "mike03", "s.johnson", "st_steward", "softuni-bulgaria", "12345". 
//	Examples of invalid users: 
//	''--123", ".....", "nakov_-", "_steve", ".info".
//	--> <host> is a sequence of at least two words, separated by dots '.'. Each word is sequence of letters and can
//	have hyphens '-' between the letters. 
//	Examples of hosts: 
//	"softuni.bg", "software-university.com","intoprogramming.info", "mail.softuni.org". 
//	Examples of invalid hosts: 
//	"helloworld", ".unknown.soft.",	"invalid-host-", "invalid-".

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text :");
		
		String[] text = sc.nextLine().split(" ");
		List<String> emails = new ArrayList<String>();
		
		String t2 =".s.miller";
		System.out.println(isValidUser(t2));
		
		
		for (int i = 0; i < text.length; i++) {
			boolean isValidUser,isValidHost;
			String user,host;
			String email;
			
			int indexEmail = text[i].indexOf('@');
			if(indexEmail >=0){
				user = text[i].substring(0, indexEmail);
				host = text[i].substring(indexEmail);
				isValidUser = isValidUser(user);
				
//				isValidHost = isValidHost(host);
//				if(isValidUser && isValidHost){
//					emails.add(user + host);
//				}
				//System.out.println(user);
				//System.out.println("user " + isValidUser);
				//System.out.println("host "+ isValidHost);
			}
		}
		
		//print emails 
		for (String email : emails) {
			System.out.println(email);
		}
	}
	
	public static boolean isValidUser(String user){
		boolean isValid = false;
		char [] permittedDigits = {'.','-','_'};
		for (int i = 0; i < user.length(); i++) {
			char currentChar = user.charAt(i);
			boolean isValidChar = false;
			for (int j = 0; j < permittedDigits.length; j++) {
				if (currentChar == permittedDigits[j] || Character.isLetterOrDigit(currentChar)){
					//check if the permitted char .-_ is at the end
					if ((currentChar == permittedDigits[j])  && (i == 0 || i== user.length()-1)){
						isValidChar = false;
					}
					isValidChar = true;
					break;
				}
			}
			if (!isValidChar){
				isValid = false;
				break;
			}
			else{
				isValid = true;
			}
		}
		return isValid;
	}
	
	public static boolean isValidHost(String host){
		boolean isValidHost = false;
		int indexDot = host.indexOf('.');
		if (indexDot>0){
			
			for (int i = 0; i < host.length(); i++) {
				char current = host.charAt(i);
				if(Character.isLetter(current) || ((current == '-') && notInTheEndOrBeginning(host, '-'))){
					isValidHost = true;
				}
			}
		}
		return isValidHost;
	}
	
	public static boolean notInTheEndOrBeginning(String str, char ch){
		boolean isValid = false;
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if(current == ch) {
				if (i != 0 || i != str.length()-1){
					isValid = true;
				}
			}
		}
		return isValid;
	}

}
