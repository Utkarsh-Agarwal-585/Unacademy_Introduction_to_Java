package Introduction_to_Java_14;

public class TogglingCases {

	public static void main(String[] args) {
		

		System.out.println(toggleCase("abCDFadaaG"));

	}

	private static String toggleCase(String string) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < string.length(); i++) {
			
			char ch = string.charAt(i);
			char ans = ' ';
			//97 to 122
			if(ch >= 'a' && ch <= 'z') {
				//97 - 97 + 65;
				ans = Character.toUpperCase(ch);
				//ans = (char)(ch - 'a' + 'A');
			}else if(ch >= 'A' && ch <= 'Z') {
				ans = Character.toLowerCase(ch);
				//ans = (char)(ch + 'a' - 'A');
			}
			
			sb.append(ans);
		}
		
		return sb.toString();

	}

}
