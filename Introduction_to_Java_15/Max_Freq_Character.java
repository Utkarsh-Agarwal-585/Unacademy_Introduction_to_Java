package Introduction_to_Java_15;

import java.util.HashMap;
import java.util.Set;

public class Max_Freq_Character {

	public static void main(String[] args) {
		

		String str = "aabcaddebbbf";
		
		System.out.println(maxFreqChar(str));

	}

	private static char maxFreqChar(String str) {
		

		//Store the freq of all the characters in the hashmap	
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				//val contains the value of key ch
				int val = map.get(ch);
				map.put(ch, val + 1);
			}else {
				map.put(ch, 1);
			}
		}
		
		//Iterate over the hashmap and pick the character with max frequency
		Set<Character> keys = map.keySet(); //a, b, c, d, e, f
		
		int maxFreq = Integer.MIN_VALUE;
		char maxchar = ' ';
		
		for(char key: keys) {
			
			if(map.get(key) > maxFreq) {
				maxFreq = map.get(key);
				maxchar = key;
			} 
		}
		
		return maxchar;
		
	}

}
