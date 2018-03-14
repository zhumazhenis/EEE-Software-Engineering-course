
/*
 * Exercise 2
 * Done by Zhumazhenis Dairabay,
 * ID 201471247 
 * last edited on 15.01.2018
 */

import java.util.Scanner;

public class CheckInteger {
	public static void main(String[] args) {
		int n; // declare integer n
		System.out.print("Enter any integer number: "); // display the text on monitor
		Scanner scanner = new Scanner(System.in); // scanner variable which assists to get input
		n = scanner.nextInt(); // assign input integer to n

		/*
		 * Firstly the the number is checked whether even or odd, after that checked
		 * whether positive or negative or neither. After that output is displayed on
		 * monitor using System.out.print
		 */
		if (n % 2 == 0) {
			if (n > 0) {
				System.out.print(n + " is positive and even.");
			} else if (n < 0) {
				System.out.print(n + " is negative and even.");
			} else {
				System.out.print(n + " is neither positive and negative, and even.");
			}
		} else {
			if (n > 0) {
				System.out.print(n + " is positive and odd.");
			} else if (n < 0) {
				System.out.print(n + " is negative and odd.");
			} else {
				System.out.print(n + " is neither positive and negative, and odd.");
			}
		}
	}
}
