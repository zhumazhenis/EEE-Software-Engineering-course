
/*
 * Done by Zhumazhenis Dairabay
 * ID 201471247
 * Last edited 22.01.2018
 * 
 * Exercise 2
 */

public class Fibonacci {
	public static int MAX_TERM_VALUE = 10000;

	public static void main(String[] args) {
		int term = 0, next = 1, temp; // term is current term of the sequence, next is next term.

		/*
		 * F_(n+2) = F_(n+1) + F_(n). term becomes next, and next becomes sum of term
		 * and next on each step of the loop.
		 */
		while (term < MAX_TERM_VALUE) {
			System.out.print(term + " ");
			temp = next;
			next += term;
			term = temp;
		}
	}
}
