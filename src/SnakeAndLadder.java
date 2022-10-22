import java.util.Random;

class SnakeAndLadder {
	static int playerposition1;
	static int playerposition2;

	static int count;

	public static void main(String[] args) {

		while ((playerposition1 < 100) && (playerposition2 < 100)) {
			player1();
			player2();
		}
		if (playerposition1 == 100) {
			System.out.println("player1 won the gane");
		}
		if (playerposition2 == 100) {
			System.out.println("player2 won the game");
		}

	}

	public static void player1() {
		count++;
		System.out.println("number of time the die is rolling" + count);
		Random r = new Random();
		int dienumber = r.nextInt(1, 7);

		// uc3: checking for option play, no play
		Random r2 = new Random();
		int gametime = r2.nextInt(0, 3);
		switch (gametime) {
		case 0:
			playerposition1 = playerposition1 + dienumber;

			break;
		case 1:

			playerposition1 = playerposition1 - dienumber;

			break;
		default:
			System.out.println("No play");
			break;
		}
		if (playerposition1 > 100) {
			playerposition1 = playerposition1 - dienumber;
		}
		if (playerposition1 < 0) {
			playerposition1 = 0;
		}
		System.out.println("player 1 position is: " + playerposition1 + " number of time the die rolled: " + count);
	}

	public static void player2() {
		count++;
		System.out.println("number of time the die is rolling: " + count);
		Random r = new Random();
		int dienumber = r.nextInt(1, 7);

		// uc3: checking for option play, no play
		Random r2 = new Random();
		int gametime = r2.nextInt(0, 3);
		switch (gametime) {
		case 0:
			playerposition2 = playerposition2 + dienumber;
			break;
		case 1:

			playerposition2 = playerposition2 - dienumber;

			break;
		default:
			System.out.println("No play");
			break;
		}
		if (playerposition2 > 100) {
			playerposition2 = playerposition2 - dienumber;
		}
		if (playerposition2 < 0) {
			playerposition2 = 0;
		}
		System.out.println("player2 position is: " + playerposition2 + " number of time the die rolled: " + count);
	}

}