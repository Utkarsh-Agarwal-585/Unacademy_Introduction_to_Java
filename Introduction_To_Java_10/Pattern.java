package Introduction_To_Java_10;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		// no of stars
		int nst = n / 2;
		// no of spaces
		int nsp = 1;

		for (int row = 1; row <= n; row++) {

			// stars
			// cst = count of stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}

			// next row
			System.out.println();
			if (row <= n / 2) {
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}

		}

	}

}
