package Introduction_to_Java_19;

public class Recursion {

	public static void main(String[] args) {
		

		int a = 5;
		int b = 3;
		
		
//		System.out.println(power(a, b));
//		System.out.println(power2(a, b));
		
		//System.out.println(fibonacci(1));
		displayArray(new int[] {4 ,23 ,123, 11}, 0);
	}

	private static int power(int a, int b) {
		
		if(b == 0) {
			return 1;
		}
		int res = power(a, b - 1);
		int myres = a * res;

		
		return myres;
	}
	
	private static int power2(int a, int b) {
		
		if(b == 0) {
			return 1;
		}
		int rr = power2(a, b / 2);
		
		int ans;
		
		if(b % 2 == 0) {
			ans = rr * rr;
		}else {
			ans = rr * rr * a;
		}
	
		return ans;
	}
	
	private static int fibonacci(int n) {
		
		//base case
		if(n == 0 || n == 1) {
			return n;
		}
		
		//recursive call
		return fibonacci(n - 1) + fibonacci( n - 2);
		
	}
	
	
	//arr, 0
	//smaller problem [1, n - 1]
	private static void displayArray(int[] arr, int vidx) {
		
		if(vidx == arr.length) {
			return;
		}
		System.out.println(arr[vidx]);
		displayArray(arr, vidx + 1);
	}

}
