
/*
 * Done by Zhumazhenis Dairabay
 * ID 201471247
 * Last edited 22.01.2018
 * 
 * Exercise 3
 */

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();
		printTriangle(n);
	}
	
	/*
	 * printTriangle(int n) function displays numbers as desired.
	 * The function first finds the maximum integer row such that row(row+1)/2 <= n.
	 * row is the number of rows that will be displayed (e.g if n = 30, row = 7).
	 * And the 1st row is filled with 1 number, 2nd row with 2 numbers, ..., kth row with k numbers.
	 * Also, the sequence can be represented as:
	 * end = 1: 			(end + 0)
	 * end = end + 1: 	(end + 0) (end + 1)
	 * end = end + 2: 	(end + 0) (end + 1) (end + 2)
	 * end = end + 3: 	(end + 0) (end + 1) (end + 2) (end + 3)
	 * 	.						
	 * 	.								
	 * 	.						
	 * end = end+row-1:  (end + 0) (end + 1) (end + 2) (end + 3) ... (end + row -1)
	 * The function follows above illustrated algorithm 
	 */

	public static void printTriangle(int n) {
		int row, end = 1;
		row = (int) ((Math.sqrt(8 * n + 1) - 1) / 2);
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((end + j) + "\t");
			}
			System.out.println();
			end += i;
		}
	}
}
