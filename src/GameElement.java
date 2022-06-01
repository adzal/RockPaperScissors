/**
 * Game element enumeration
 * @author adzal
 *
 */
public enum GameElement {
	ROCK, PAPER, SCISSORS;
	/**
	 * Converts a string into a GameElement Enum
	 * @param humanChoice
	 * @return GameElemnt of choice
	 */
	public static GameElement stringToGameElement(String humanChoice) {
		GameElement choice = null;
		switch (humanChoice) {
		case "r", "R" -> choice = GameElement.ROCK;
		case "p", "P" -> choice = GameElement.PAPER;
		case "s", "S" -> choice = GameElement.SCISSORS;
		}
		return choice;
	}
}
