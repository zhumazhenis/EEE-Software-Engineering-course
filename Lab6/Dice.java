
/*
 * Done by Zhumazhenis Dairabay
 * Lab 6
 * Exercise 1
 */

public class Dice {

	public int roll() {
		/*
		 * Math.random() method returns double number [0, 1), 
		 * so, 1 <= (1 + random() * 6) <= 6
		 */
		return 1 + (int) (Math.random() * 6);
	}
}
