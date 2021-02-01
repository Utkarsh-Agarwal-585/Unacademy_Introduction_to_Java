package Introduction_to_Java_14;

import java.util.ArrayList;

public class Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		

		int[] one = {   9, 9, 9};
		int[] two = {9, 9, 9, 9};
		
		ArrayList<Integer> list = sum(one, two);
		
		System.out.println(list);

	}

	//function declaration 
	private static ArrayList<Integer> sum(int[] one, int[] two) {
		

		
		ArrayList<Integer> ans = new ArrayList<>();
		
		int i = one.length - 1; //i = -2 // nothing
		int j = two.length - 1; //j = -1 //9
		
		int carry = 0; // 1
		
		while(i >= 0 || j >= 0) {
			
			int sum = 0;
			
			sum += carry; //1
			
			if(i >= 0) {
				sum += one[i]; //
			}
			if(j >= 0) {
				sum += two[j]; // 10
			}
			
			int rem = sum % 10; //0
			ans.add(0, rem); //[0, 9, 9, 8]
			
			carry = sum / 10; //1 
			
			i--;
			j--;
		}
		
		if(carry != 0) {
			ans.add(0, carry); //[1, 0, 9, 9, 8]
		}
		
		return ans;
		
	}

}
