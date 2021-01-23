package Introduction_to_Java_9;

import java.util.Scanner;

//o(n) * o(n)
public class Check_All_Prime {

	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i = 2; i < n; i++) {
			
			boolean res = isPrime(i);
			if(res) {
				System.out.println(i);
			}
		}
	}

	//O(n/2) = O(n)
	public static boolean isPrime(int num) {

		boolean flag = true;
		for (int div = 2; div <= num / 2; div++) {

			int rem = num % div;

			if (rem == 0) {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			return true;
		} else {
			return false;
		}
	}
}
