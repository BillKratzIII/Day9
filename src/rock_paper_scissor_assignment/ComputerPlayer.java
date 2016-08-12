package rock_paper_scissor_assignment;

import rock_paper_scissor_assignment.Choices.roshambo;

public class ComputerPlayer extends Player {

	// constructor
	public ComputerPlayer() {
	}

	// method that uses a random number to decide which throw the computer
	// player chooses
	@Override
	public void takeATurn() {
		int temp = (int) ((Math.random() * 5) + 1);
		switch (temp) {
		case 1:
			this.selection = roshambo.ROCK;
			break;
		case 2:
			this.selection = roshambo.PAPER;
			break;
		case 3:
			this.selection = roshambo.SCISSORS;
			break;
		case 4:
			this.selection = roshambo.LIZARD;
			break;
		case 5:
			this.selection = roshambo.SPOCK;
			break;
		}

	}

}
