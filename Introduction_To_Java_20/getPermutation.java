package Introduction_To_Java_20;

import java.util.ArrayList;

public class getPermutation {

	public static void main(String[] args) {
		

		System.out.println(getPermutations("abcd"));

	}

	private static ArrayList<String> getPermutations(String str) {
		

		if(str.length() == 0) {
			
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0); //a
		
		String ros = str.substring(1); //bc
		
		//recursive call
		ArrayList<String> rr = getPermutations(ros); //[bc, cb]
		
		ArrayList<String> mr = new ArrayList<>();
		
		//self work
		for(String rrs: rr) {   //[bc, cb]
			
			//rrs = "bc"
			//i = 2
			for(int i = 0; i <= rrs.length(); i++) {
				
				// "" + a + bc = abc
				// b + a + c = bac
				// bc + a + "" = bca
				String ans = rrs.substring(0, i) + ch + 
						rrs.substring(i);
				
				mr.add(ans);
			}
		}
		
		return mr;
	}

}
