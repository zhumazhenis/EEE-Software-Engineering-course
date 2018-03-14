
/*
 * Done by Zhumazhenis Dairabay
 * ID 201471247
 * Last edited 22.01.2018
 * 
 * Exercise 5
 */

import java.util.Scanner;

public class Equation {
	public static void main(String[] args) {
		double a, b, c, d;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quadratic coefficients: ");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		scanner.close();
		d = b * b - 4 * a * c;
		System.out.println("Discriminant: " + d);

		if (d > 0) {
			System.out.print("Roots: ");
			d = Math.sqrt(d);
			System.out.println((-b + d) / 2 / a + ", " 
			+ ((-b - d) / 2 / a));
		} else if (d == 0) {
			System.out.print("Only one root!\nRoot: ");
			System.out.println(-b / 2 / a);
		} else {
			System.out.print("It has complex roots!\nRoots: ");
			d = Math.sqrt(-d);
			System.out.print(-b / 2 / a + " + " + (d / 2 / a) 
					+ "i, " + -b / 2 / a + " - " + (d / 2 / a) + "i");
		}
	}
}
