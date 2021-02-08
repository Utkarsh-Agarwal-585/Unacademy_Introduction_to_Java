package Introduction_to_Java_18;

public class Recursion {

	public static void main(String[] args) {
		

		PrintDecreasing(5);

	}

	private static void PrintDecreasing(int i) {
		
		if(i == 0) { //Base Case
			//return;
		}
		
		System.out.println(i); //self work
		PrintDecreasing(i - 1);		 //Recursive call
		
	}

}
