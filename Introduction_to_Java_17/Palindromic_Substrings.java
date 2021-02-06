package Introduction_to_Java_17;

public class Palindromic_Substrings {

	public static void main(String[] args) {
		

		String str = "ababa";
		
		System.out.println(countPalindromicSS("ababa"));

	}

	//Time Complexity: O(n2)
	private static  int countPalindromicSS(String str) {
		

		int count = 0;
		
		//odd length of s 
		//we are placing the axis over each character
		for(int axis = 0; axis < str.length(); axis++) {
			
			//for a particular axis, we try to expand the orbit. 
			//Initial size of orbit is 0. Then try to expand the orbit around the axis
			//on both its left and right size. 
			for(int orbit = 0; (axis - orbit >= 0) && (axis + orbit < str.length()); orbit++) {
				
				//checking if the char at both ends of orbit are same. 
				if(str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				}else {
					//now is the time to shift the axis to new character. 
					break;
				}
			}
		}
		
		//even length of s
		//we are placing the axis between two characters.
		for(double axis = 0.5; axis < str.length(); axis++) {
			
			for(double orbit = 0.5; (axis - orbit >= 0) && (axis + orbit < str.length()); orbit++) {
				
				if(str.charAt((int)(axis - orbit)) == str.charAt((int)(axis + orbit))) {
					count++;
				}else {
					break;
				}
			}
		}
		
		
		return count;
	}

}
