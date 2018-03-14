
/*
 * Done by Zhumazhenis Dairabay
 * ID 201471247
 * Exercise 2
 * Lab 4
 */

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a and b: ");
		int a = s.nextInt(), b = s.nextInt();
		s.close();
		
		System.out.println("\nBefore swapping:\n" + "a = " + a + "\nb = " + b);
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("\nAfter XOR swapping:\n" + "a = " + a + "\nb = " + b);
		
		int a2 = b, b2 = a;
		
		a2 = a2 + b2;
		b2 = a2 - b2;
		a2 = a2 - b2;
		System.out.println("\nAfter add and sub:\n" + "a = " + a2 + "\nb = " + b2);
	}
}
