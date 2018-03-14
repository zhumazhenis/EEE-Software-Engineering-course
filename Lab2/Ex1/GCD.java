
/*
 * Done by Zhumazhenis Dairabay
 * ID 201471247
 * Last edited 22.01.2018
 * 
 * Exercise 1
 */

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter two integer numbers: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		System.out.print("GCD of " + a + " and " + b 
				+ ": " + gcdOfPositives(a, b));
	}

	/*
	 * static int gcdOfPositives(int a, int b) is implemented below. The purpose is
	 * to find the GCD of two 'positive' integers. It takes integers a and b as
	 * arguments, and returns integer number.
	 */
	public static int gcdOfPositives(int a, int b) {
		int temp, r;

		/*
		 * 1st step is done here. If a < b, it exchanges a and b
		 */
		if (a < b) {
			temp = b;
			b = a;
			a = temp;
		}

		/*
		 * 2. Divide a by b and get the remainder r. If r = 0, returns b as GCD. 3.
		 * Otherwise, replace a by b and replace b by r. Return to the previous(2) step.
		 */
		while ((r = a % b) > 0) {
			a = b;
			b = r;
		}
		return b;
	}
}
