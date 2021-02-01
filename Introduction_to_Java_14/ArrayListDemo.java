package Introduction_to_Java_14;

import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		

		ArrayList<Integer> list = new ArrayList<>();
		
		//print
		System.out.println(list);
		
		//add
		list.add(10); //0
		list.add(20); //1
		list.add(30); //2
		list.add(40); //3
		
		//print
		System.out.println(list);
		
		//add at index
		list.add(2, 50); //stores the element 50 at index 2.
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.set(3,  70);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		

	}

}
