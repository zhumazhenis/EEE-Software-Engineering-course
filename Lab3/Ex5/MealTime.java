
/*
 * Done by Zhumazhenis Dairabay
 * Lab 3
 * Exercise 5
 * Last edited 29.01.2018
 */

import java.util.Scanner;

public class MealTime {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		askWhatYouAteFor("breakfast");
		askWhatYouAteFor("lunch");
		askWhatYouAteFor("dinner");
		scanner.close();
	}

	/*
	 * askWhatYouAteFor(String s) method prints what the task asks!
	 */
	public static void askWhatYouAteFor(String s) {
		String ate;
		System.out.println("What did you eat for " + s + "?");
		ate = scanner.nextLine();
		System.out.println("You had " + ate + " for " + s + ".\n");
	}
}
