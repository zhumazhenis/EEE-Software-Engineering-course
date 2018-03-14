/*
 * Exercise 4
 * Done by Zhumazhenis Dairabay,
 * ID 201471247 
 * last edited on 15.01.2018
 */

public class FindPi {
	public static void main(String[] args) {

		int[] a = { 100, 500, 1000, 5000, 10000 }; // array for loops

		double pi = 0; // the number Pi

		/*
		 * Firstly the loop value is chosen from initialized array. After that, each
		 * term of sum is added to previous value of sum. Here the algorithm is that,
		 * denominator = 2 * j + 1, and sign = 1 if j = even, otherwise sign = -1. After
		 * inside loop is finished, pi = 4 * pi according to formula. After that, it
		 * displayed on monitor, then again pi = 0 for next loop.
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < a[i]; j++) {
				if (j % 2 == 0) {
					pi = pi + 1 / (double) (2 * j + 1);
				} else {
					pi = pi - 1 / (double) (2 * j + 1);
				}
			}
			pi = 4 * pi; // the value of Pi according to formula
			System.out.println("The value of Pi = " + pi 
					+ " when loop is " + a[i] + " times.");
			pi = 0;
		}
	}
}
