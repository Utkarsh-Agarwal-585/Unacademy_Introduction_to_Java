package Introduction_to_Java_11;

public class Product_except_self {

	public static void main(String[] args) {
		

		int[] arr = {4, 5, 1, 8, 2};
		
		int[] result = product(arr);
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] +  " ");
		}

	}

	private static int[] product(int[] arr) {
		

		int len = arr.length;
		
		//left;
		int[] left = new int[len];
		
		//for the index 0, there are no elements to the left of it. 
		left[0] = 1;
		
		for(int i = 1; i < len; i++) {
			
			//left[i - 1] contains the product of elements to the left of 'i - 1'
			left[i] = arr[i - 1] * left[i - 1];
		}
		
		int[] right = new int[len];
		
		right[len - 1] = 1;
		
		for(int i = len - 2; i >= 0; i--) {
			
			right[i] = arr[i + 1] * right[i + 1];
		}
		
		int[] ans = new int[len];
		
		for(int i = 0; i < len; i++) {
			
			ans[i] = left[i] * right[i];
		}
		
		return ans;
	}

}
