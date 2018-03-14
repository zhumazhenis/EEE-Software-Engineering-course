/*
 * Done by Zhumazhenis Dairabay
 * Lab 3
 * Exercise 2
 * Last edited 29.01.2018
 */

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter string: ");
		String string = scanner.nextLine();
		scanner.close();
		System.out.println();

		int letter = 0, space = 0, digit = 0, other;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i))) {
				letter++;
			}

			if (Character.isDigit(string.charAt(i))) {
				digit++;
			}

			if (Character.isSpaceChar(string.charAt(i))) {
				space++;
			}
		}

		other = string.length() - letter - space - digit;

		System.out.println("No. of letters: " + letter);
		System.out.println("No. of spaces: " + space);
		System.out.println("No. of numbers: " + digit);
		System.out.println("No. of other characters: " + other);
	}
}
