/*
 * Done by Zhumazhenis Dairabay
 * Lab 3
 * Exercise 3
 * Last edited 29.01.2018
 */

import java.util.Scanner;

public class Middle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a string: ");
		String string = scanner.nextLine();
		scanner.close();

		if (string.length() == 0) {
			System.out.println("Nothing entered");
		} else {
			System.out.println("The middle character in the string is " + middle(string));
		}
	}

	/*
	 * String middle(String s) method below returns the middle symbol if the
	 * string.length() is odd, otherwise returns two symbols that are at middle
	 */
	public static String middle(String s) {
		int pos = s.length() / 2;

		if (s.length() % 2 == 0) {
			return s.substring(pos - 1, pos + 1);
		}
		return s.substring(pos, pos + 1);
	}
}
