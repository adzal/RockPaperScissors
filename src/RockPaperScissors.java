import java.security.SecureRandom;

/**
 * @author adzal
 *
 */
public class RockPaperScissors {
	private static final SecureRandom random = new SecureRandom();
	private GameElement aiChoice;

	private Boolean isWinner = false;
	public boolean getIsWinner() {
		return isWinner;
	}

	private boolean isGameOver;

	public boolean Over() {
		return isGameOver;
	}

	private String message;

	public String getMessage() {
		return message;
	}

	/**
	 * chooses a random element for the computer
	 */
	public void chooseElement() {
		aiChoice = randomEnum(GameElement.class);
	}

	/**
	 * Function to see which player wins
	 * 
	 * @param humanChoice
	 */
	public void play(GameElement choice) {
		if (choice == aiChoice) {
			message = "The same, Try Again";
		} else {
			switch (choice) {
			case SCISSORS:
				if (aiChoice == GameElement.PAPER) {
					setGameIsOver(true, "Scissors cuts paper, you win");
				} else {
					setGameIsOver(false, "Rock smashes Scissors, you lose");
				}
				break;
			case PAPER:
				if (aiChoice == GameElement.ROCK) {
					setGameIsOver(true, "Paper covers Rock, you win");
				} else {
					setGameIsOver(false, "Scissors cut paper, you lose");
				}
				break;

			case ROCK:
				if (aiChoice == GameElement.SCISSORS) {
					setGameIsOver(true, "Rock smashes Scissors, you win");
				} else {
					setGameIsOver(false, "Paper covers Rock, you lose");
				}
				break;
			}
		}
	}


	/**
	 * Set the isGameOver, isWinner and message when game is finished
	 * 
	 * @param isWinner
	 * @param message
	 */
	private void setGameIsOver(Boolean isWinner, String message) {
		isGameOver = true;
		this.isWinner = isWinner;
		this.message = message;
	}

	public static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
		int x = random.nextInt(clazz.getEnumConstants().length);
		return clazz.getEnumConstants()[x];
	}

	public void reset() {
		isGameOver = false;
	}
}
