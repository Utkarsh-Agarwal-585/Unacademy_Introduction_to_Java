package Introduction_to_Java_18;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		

		int[] arr = {2, 12, 9, 16, 10, 5 ,3 , 20, 25, 11, 1, 8 ,6};
		
		ArrayList<Integer> res = LCS(arr);
		
		System.out.println(res);

	}

	//return the elements of the Longest Consecutive Sequence
	private static ArrayList<Integer> LCS(int[] arr) {
		

		//store all the starting point for a possible sequences in the hashmap
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		//iterating over the array elements one by one. 
		for(int i = 0; i < arr.length; i++) {
			//check for previous element
			int nm1 = arr[i] - 1;
			
			//if previous element is present in hashmap, then current element cannot be a start of the sequence. 
			if(map.containsKey(nm1)) {
				//if true
				map.put(arr[i], false);
			}else {
				//otherwise, current element is a possible candidate to become a start of the sequence.
				map.put(arr[i],true);
			}
			
			//Now you check for the next element. Eg: if curr element = 10, then next element is 11, 
			//So, if 10 is now introduced, then 11 cannot be a start of the sequence, 
			//hence mark a false against it. 
			int np1 = arr[i] + 1;
			if(map.containsKey(np1)) {
				map.put(np1, false);
			}
		}
		
		//Store all the keys of the hashmap in an arraylist
		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		
		//If I know the length of the LCS and the starting point, 
		//then very easily, I can find the elements of that sequence as well. 
		//For eg: maxlength = 5, maxStartingNo = 8, 
		//arr = [8, 9, 10, 11, 12]
		//Length of the LCS
		int maxLength = Integer.MIN_VALUE;
		//Starting element of the LCS. 
		int maxStartingNo = 0;
		
		//iterating over each element of the arrayList
		//for(int i = 0; i < keys.length; i++){
		//  int key = keys.get(i);	
		//}
		
		for(int key: keys) {
			
			//[1, 5, 8, 16, 20, 25]
			if(map.get(key) == true) {
				
				//pstartingNo = 8;
				int pStartingNo = key;
				int count = 0; //5 
				
				// 8 + 5 ?? - No
				while(map.containsKey(pStartingNo + count)) {
					count++;
				}
				
				if(count > maxLength) {
					maxLength = count;
					maxStartingNo = pStartingNo;
				}
				
			}
		}
		
		//maxStartingNo - 8
		//length = 5
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = 0; i < maxLength; i++) {
			res.add(maxStartingNo + i); //8 + 4
		}
		
		
		return res;
	}

}
