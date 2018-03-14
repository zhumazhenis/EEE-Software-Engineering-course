
/*
 * Exercise 3
 * Done by Zhumazhenis Dairabay,
 * ID 201471247 
 * last edited on 15.01.2018
 */
import java.util.Scanner;

public class SumInteger {
	public static void main(String[] args) {
		int n, k, sum; // declare integers sum = n + k is processed later.
		System.out.print("Enter two decimal numbers: "); // display on monitor
		Scanner scanner = new Scanner(System.in); // assist to get input
		n = scanner.nextInt(); // assign input integer to n
		k = scanner.nextInt(); // assign input integer to k
		sum = n + k; // sum = k + n
		System.out.println("The sum of " + n + " and " + k + " is " + sum + "."); // display on monitor
		/*
		 * Firstly the the sum is checked whether even or odd, after that checked
		 * whether positive or negative or neither. After that output is displayed on
		 * monitor using System.out.print
		 */
		if (sum % 2 == 0) {
			if (sum > 0) {
				System.out.print(sum + " is positive and even.");
			} else if (sum < 0) {
				System.out.print(sum + " is negative and even.");
			} else {
				System.out.print(sum + " is neither positive and negative, and even.");
			}
		} else {
			if (sum > 0) {
				System.out.print(sum + " is positive and odd.");
			} else if (sum < 0) {
				System.out.print(sum + " is negative and odd.");
			} else {
				System.out.print(sum + " is neither positive and negative, and odd.");
			}
		}
	}
}
