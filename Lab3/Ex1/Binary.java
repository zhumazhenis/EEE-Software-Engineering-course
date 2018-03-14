/*
 * Done by Zhumazhenis Dairabay
 * Lab 3
 * Exercise 1
 * Last edited 29.01.2018
 */

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		int binary = scanner.nextInt();
		scanner.close();

		System.out.println("Hexadecimal value: " + toHex(binary));
		System.out.println("Octal value: " + toOct(binary));
	}

	/*
	 * toOct is the method which converts binary to octal. The algorithm is that, it
	 * separates numbers into groups which consists of 3 digits, then multiplies
	 * each digit to 1, 2, 4 starting from the end and sums them. Then each result
	 * prints.
	 */

	public static String toOct(int a) {
		String oct = "";

		while (a > 0) {
			int temp = a % 1000;
			int r = 0;
			int two = 1;
			for (int i = 0; i < 3; i++) {
				r += (temp % 10) * two;
				two *= 2;
				temp /= 10;
			}
			oct = Integer.toString(r) + oct;
			a /= 1000;
		}
		return oct;
	}

	/*
	 * toHex is the method which converts binary to hexadecimal. The algorithm is
	 * that, it separates numbers into groups which consists of 4 digits, then
	 * multiplies each digit to 1, 2, 4, 8 starting from the end and sums them. Then
	 * each results prints.
	 */
	public static String toHex(int a) {
		String hex = "";
		while (a > 0) {
			int temp = a % 10000;
			int r = 0;
			int two = 1;
			for (int i = 0; i < 4; i++) {
				r += (temp % 10) * two;
				two *= 2;
				temp /= 10;
			}

			if (r < 10) {
				hex = Integer.toString(r) + hex;
			} else if (r == 10) {
				hex = "A" + hex;
			} else if (r == 11) {
				hex = "B" + hex;
			} else if (r == 12) {
				hex = "C" + hex;
			} else if (r == 13) {
				hex = "D" + hex;
			} else if (r == 14) {
				hex = "E" + hex;
			} else if (r == 15) {
				hex = "F" + hex;
			}

			a /= 10000;
		}
		return hex;
	}
}
