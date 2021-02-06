package Introduction_to_Java_17;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_Of_Non_Sorted_Arrays {

	public static void main(String[] args) {

		int[] a1 = { 5, 5, 7, 7, 2, 5 };
		int[] a2 = { 6, 7, 9, 5, 5, 5, 5 };
		
		ArrayList<Integer> res = intersection(a1, a2);
		
		System.out.println(res);

	}

	private static ArrayList<Integer> intersection(int[] a1, int[] a2) {
		
		//store all the elements of a1 in hashmap
		ArrayList<Integer> res = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < a1.length; i++) {
			
			if(map.containsKey(a1[i])) {
				int val = map.get(a1[i]);
				val += 1;
				map.put(a1[i], val);
			}else {
				map.put(a1[i], 1);
			}
		}
		
		for(int i = 0; i < a2.length; i++) {
			
			if(map.containsKey(a2[i]) && map.get(a2[i]) > 0) {
				res.add(a2[i]);
				
				int of = map.get(a2[i]);
				int nf = of - 1;
				map.put(a2[i], nf);
			}
		}
		
		return res;
	}

}
