/*
 * Done by Zhumazhenis Dairabay
 * Lab 3
 * Exercise 4
 * Last edited 29.01.2018
 */

import java.util.Scanner;

public class Leap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int y = scanner.nextInt();
		scanner.close();

		/*
		 * y % 4 == 0; | | y % 4 != 0; y % 100 == 0; | y % 100 != 0; | y % 400 == 0;| y
		 * % 400 != 0;| | leap | not | leap | not
		 */
		if (y % 4 == 0) {
			if (y % 100 == 0) {
				if (y % 400 == 0) {
					System.out.println(y + " is leap year.");
				} else {
					System.out.println(y + " is not leap year.");
				}
			} else {
				System.out.println(y + " is leap year.");
			}

		} else {
			System.out.println(y + " is not leap year.");
		}
	}
}
