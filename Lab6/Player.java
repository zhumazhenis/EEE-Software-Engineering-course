/*
 * Done by Zhumazhenis Dairabay
 * Lab 6
 * Exercise 1
 */

public class Player {
	public int id, score = 0;
	public String name;

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void updateScore(int d1, int d2) {
		if ((d1 + d2) % 2 == 1)
			score += (d1 + d2);
	}

	public String toString() {
		return name + ", ID" + id + ": \t" + String.valueOf(score);
	}
}
