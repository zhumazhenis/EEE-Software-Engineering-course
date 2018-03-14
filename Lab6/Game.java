
/*
 * Done by Zhumazhenis Dairabay
 * Lab 6
 * Exercise 1
 */

import java.util.Scanner;

public class Game {
	
	Player playerA, playerB, playerC;
	Dice d1, d2;

	public Game() {
		
		playerA = new Player(201471247, "Zhuma");
		playerB = new Player(201498156, "Beka");
		playerC = new Player(201442141, "Tako");
		d1 = new Dice();
		d2 = new Dice();
	}

	/* compares scores of two players, and returns higher player */
	private Player maxOfTwoPlayers(Player a, Player b) {
		if (a.score == b.score)
			return null;
		else if (a.score > b.score)
			return a;
		return b;
	}
	


	/* identifies winner among three players, using maxOfTwoPlayers method */
	Player winner() {
		Player ab = maxOfTwoPlayers(playerA, playerB);
		if (ab != null)
			return maxOfTwoPlayers(ab, playerC);
		if (playerA.score >= playerC.score)
			return null;
		return playerC;
	}

	/* n rounds performed */
	public void play() {
		System.out.println("Enter number of rounds: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // number of rounds
		scanner.close();

		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + " round");

			/* playerA rolls */
			playerA.updateScore(d1.roll(), d2.roll());
			System.out.println(playerA.toString());

			/* playerB rolls */
			playerB.updateScore(d1.roll(), d2.roll());
			System.out.println(playerB.toString());

			/* playerC rolls */
			playerC.updateScore(d1.roll(), d2.roll());
			System.out.println(playerC.toString() + "\n");
		}

		if (winner() != null)
			System.out.println("Winner!\n" + winner().toString());
		else
			System.out.println("Nich'ya!"); // if there is the same maximum scores
	}
}
