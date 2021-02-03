package Introduction_to_Java_15;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMaps_Demo {

	public static void main(String[] args) {
		

		HashMap<String, Integer> map = new HashMap<>();
		
		//put
		//<Key, Value>
		map.put("India", 126); //O(1)
		map.put("Sri Lanka", 96);
		map.put("Australia", 126);
		

		//print HashMap
		System.out.println(map);
		
		//You cannot store duplicate keys in hashmap. 
		//However, if you try to store duplicate key with another value
		// it will replace the previous value. 
		map.put("India", 129);
		
		System.out.println(map);
		
		//get
		System.out.println(map.get("India")); //O(1)
		System.out.println("Sri lanka");
		
		//containsKey
		System.out.println(map.containsKey("West Indies"));
		System.out.println(map.containsKey("India"));
		
		//remove
		//System.out.println(map.remove("India"));
		System.out.println(map);
		
		
		//keys in arraylist
		ArrayList<String> list = new ArrayList<>(map.keySet());
		System.out.println(list);
		
		
		//get value for each key
		
		for(String val: list) {
			System.out.println(val + " -> " + map.get(val));
		}
		
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
		}
		
	}
	

}
