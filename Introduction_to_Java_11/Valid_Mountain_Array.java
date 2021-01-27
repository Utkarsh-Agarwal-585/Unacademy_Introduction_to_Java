package Introduction_to_Java_11;

public class Valid_Mountain_Array {

	public static void main(String[] args) {
		

		int[] arr = {0, 2, 4, 4, 5, 2, 1, 0};
		
		System.out.println(valid(arr));

	}

	//Time Complexity - O(n)
	//Space Complexity - O(1)
	private static boolean valid(int[] arr) {
		
		int i = 0;
		//walking up
		while(i + 1 < arr.length && arr[i] < arr[i + 1]) {
			i++;
		}
		
		//peak cannot be the first or the last element
		if(i == 0 || i == arr.length - 1) {
			return false;
		}
		
		//walking down
		while(i + 1 < arr.length && arr[i] > arr[i + 1]) {
			i++;
		}
		
//		if(i == arr.length - 1) {
//			return true;
//		}else {
//			return false;
//		}

		return i==arr.length - 1;
	}

}
