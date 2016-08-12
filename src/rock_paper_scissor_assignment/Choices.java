package rock_paper_scissor_assignment;

public class Choices {

	// enumeration to store options for the game
	enum roshambo {
		ROCK("rock"), PAPER("paper"), SCISSORS("scissors"), LIZARD("lizard"), SPOCK("spock"), CHOOSE("choose"), QUIT(
				"Quit");

		// variable to store the value of the option in String form
		String move;

		// constructor
		roshambo(String move) {
			this.move = move;
		}

		// method to return the value of the enumeration in the for of a string
		// for comparison to user input
		public String toString() {
			return move;
		}
	}

}
