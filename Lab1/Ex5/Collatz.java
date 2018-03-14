
/*
 * Exercise 5
 * Done by Zhumazhenis Dairabay,
 * ID 201471247 
 * last edited on 15.01.2018
 */

import java.util.Scanner;

public class Collatz {

	public static void main(String[] args) {
		int n; // declare integer n
		System.out.print("Enter an integer n: "); // display on monitor
		Scanner scanner = new Scanner(System.in); // assists to get input
		n = scanner.nextInt(); // integer input is assigned to n
		collatz(n); // static method which can be run without instance of the class
	}

	/*
	 * collatz method explained. Firstly, the number is checked whether even or odd.
	 * If it is even then n = n / 2, otherwise n = 3 * n + 1. And this is
	 * recursively runs until n = 1.
	 */
	public static void collatz(int n) {
		if (n % 2 == 0) {
			System.out.print(n + " ");
			n = n / 2;

		} else {
			System.out.print(n + " ");
			n = 3 * n + 1;
		}
		if (n != 1) {
			collatz(n); // recursive
		} else {
			System.out.print("1");
		}
	}
}
