
/*
 * Done by Zhumazhenis Dairabay
 * ID 201471247
 * Exercise 1
 * Lab 4
 */

import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the height: ");
		int n = s.nextInt();
		s.close();
		
		if (n <= 0)
			System.out.println("The height should be positive!");
		else
			System.out.println("Pascal triangle of height " + n + " is: \n");
		
		printPascal(n);
	}

	public static void printPascal(int n) {
		int coef = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0)
					coef = 1;
				else if (i == 0)
					coef = 1;
				else
					coef = (coef * (i - j + 1)) / j;
				System.out.print(coef + " ");
			}
			System.out.println();
		}
	}
}
