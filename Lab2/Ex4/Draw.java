
/*
 * Done by Zhumazhenis Dairabay
 * ID 201471247
 * Last edited 22.01.2018
 * 
 * Exercise 4
 */

import java.util.Scanner;

public class Draw {
	public static void main(String[] args) {
		int n;
		char c1, c2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter height of triangle: ");
		n = scanner.nextInt();
		System.out.print("Enter two characters to fill in the triangles: ");
		c1 = scanner.next().charAt(0);
		c2 = scanner.next().charAt(0);
		scanner.close();

		draw(n, c1, c2);
	}

	/*
	 * void draw() method prints two triangles. It takes integer number and two characters 
	 * as parameters, number is the height. 
	 * The function follows below algorithm.
	 * 
	 * 2n-1, 1: ######### %
 	 *	2n-3, 3:  ####### %%%
  	           	  ##### %%%%%
   		         ### %%%%%%%
    	1, 2n-1:	    # %%%%%%%%%
    *
	 */
	public static void draw(int n, char c1, char c2) {
		int m = 2 * n - 1;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < m; j++) {
				System.out.print(c1);
			}
			System.out.print(" ");
			for (int j = 0; j < 2 * n - m; j++) {
				System.out.print(c2);
			}
			System.out.println();
			m -= 2;
		}
	}
}
