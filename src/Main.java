import java.util.Scanner;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		GameLoop();
	}

	private static void GameLoop() {
		int wins = 0;
		int loses = 0;
		
		Scanner sc = new Scanner(System.in);
		
		RockPaperScissors game = new RockPaperScissors();

		while (wins < 2 && loses < 2) {

			while (!game.Over()) {
				game.chooseElement();

				System.out.println("Let's play");
				System.out.print("(R)ock (P)aper or (S)cissors>");
				String guess = sc.nextLine();
				GameElement choice = GameElement.stringToGameElement(guess);
				if (choice != null) {
					game.play(choice);

					System.out.println(game.getMessage());
				} else {
					System.out.println("Enter a valid choice");
				}
			}

			if (game.getIsWinner()) {
				wins++;
			} else {
				loses++;
			}

			System.out.printf("You:%d vs Computer:%d\n\n", wins, loses);
			game.reset();
		}

		if (wins == 2) {
			System.out.print("Bravo you hit 2 first.");
		} else {
			System.out.print("Computer hit 2 first, you lose.");
		}

		sc.close();
	}
}
