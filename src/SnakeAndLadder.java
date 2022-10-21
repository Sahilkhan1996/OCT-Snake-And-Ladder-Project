import java.util.Random;

public class SnakeAndLadder {
	static int playerposition;

	public static void main(String[] args) {

		// uc1: the position of player starting from 0
		System.out.println("The position of player is: " + playerposition);

		// uc2: the player roll the die for the 1st time.
		Random r = new Random();
		int dienumber = r.nextInt(1, 7);
		System.out.println("player Rolling die rolling and number comes is: " + dienumber);
		// uc3: checking for option play, no play
		Random r2 = new Random();
		int gametime = r2.nextInt(0, 3);
		System.out.println("snake or ladder checker: " + gametime);
		switch (gametime) {
		case 0:
			playerposition = playerposition + dienumber;
			System.out.println("Next position of the player" + playerposition);
			break;
		case 1:

			playerposition = playerposition - dienumber;
			System.out.println("Next position of the player: " + playerposition);
			break;
		default:
			System.out.println("No play");
			break;
		}
	}
}