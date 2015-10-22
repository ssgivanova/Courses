
public class _12CharacterMultiplier {

//	Create a method that takes two strings as arguments and returns the sum of their character codes multiplied
//	(multiply str1.charAt (0) with str2.charAt (0) and add to the total sum). Then continue with the next two characters.
//	If one of the strings is longer than the other, add the remaining character codes to the total sum without
//	multiplication.
	
	public static void main(String[] args) {
		
				
		int code = multiplyCharacters("Gosho", "Pesho");
		//int code = multiplyCharacters("123", "522");
		//int code = multiplyCharacters("a", "aaaa");
			
		System.out.println(code);

	}
	
	public static int multiplyCharacters(String str1, String str2){
		int sum = 0;
		int totalSum = 0;
		int length = 0;
		
		if (str1.length() > str2.length()){
			length = str2.length();
		}else{
			length = str1.length();
		}
		
		for (int i = 0; i < length; i++) {
			int code = (str1.charAt(i))*(str2.charAt(i));
			sum += code;
		}
		totalSum = sum + calculateRemainderCode(str1,str2);
		
		return totalSum;
	}
	
	public static int calculateRemainderCode(String str1, String str2){
		String remainder;
		int sum = 0;
		
		if (str1.length() > str2.length()){
			remainder = str1.substring(str2.length());
		}else{
			remainder = str2.substring(str1.length());
		}
		for (int i = 0; i < remainder.length(); i++) {
			sum += remainder.charAt(i);
		}
			
		return sum;
	}

}
