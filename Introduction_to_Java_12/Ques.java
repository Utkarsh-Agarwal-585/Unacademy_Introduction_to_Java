package Introduction_to_Java_12;

public class Ques {

	public static void main(String[] args) {
		

		System.out.println(palindrome("rahul"));
	}
	
	public static void displayChars(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static boolean palindrome(String str) {
		
		int start = 0;
		
		int end = str.length() - 1;
		
		while(start < end) {
			
			if(str.charAt(start) != str.charAt(end)) {
				
				return false;
			}
			
			start++;
			end--;
		}
		
		return true;
	}

}
