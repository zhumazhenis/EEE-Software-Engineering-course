
/*
 * Exercise 1
 * Done by Zhumazhenis Dairabay,
 * ID 201471247 
 * last edited on 15.01.2018
 */

import java.util.Scanner;

public class GetInteger {
	public static void main(String[] args) {
		int n; // declare integer n
		System.out.print("Enter any integer number: "); // display the text on monitor
		Scanner scanner = new Scanner(System.in); // scanner variable which assists to get input
		n = scanner.nextInt(); // assign input integer to n
		System.out.print("The number entered by the user: " + n); // display the text on monitor
	}
}
