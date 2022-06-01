/**
 * Game element enumeration Rock, Paper or Scissors
 * @author adzal
 *
 */
public enum GameElement {
	ROCK, PAPER, SCISSORS;
	
	/**
	 * Converts a string into a GameElement Enumeration
	 * @param humanChoice
	 * @return GameElemnt of choice
	 */
	public static GameElement stringToGameElement(String humanChoice) {
		GameElement choice = null;
		switch (humanChoice) {
		case "r", "R" -> choice = ROCK;
		case "p", "P" -> choice = PAPER;
		case "s", "S" -> choice = SCISSORS;
		}
		return choice;
	}
}
