package Introduction_To_Java_20;

import java.util.ArrayList;

public class GetSubsequences {

	public static void main(String[] args) {

		System.out.println(getSS("abcd"));

	}

	private static ArrayList<String> getSS(String str) {

		//base case
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		char ch = str.charAt(0); // a
		String ros = str.substring(1); // bc
		
		//recursive call
		ArrayList<String> rr = getSS(ros); // ["", b, c, bc]

		//self work
		ArrayList<String> mr = new ArrayList<>();

		for (String rrs : rr) { // ["", b, c, bc]

			mr.add(rrs); // not "", b , c , bc
			mr.add(ch + rrs); // yes a, ab , ac , abc
		}

		return mr;

	}

}
