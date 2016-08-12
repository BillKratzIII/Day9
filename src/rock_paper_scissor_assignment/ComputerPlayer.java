package rock_paper_scissor_assignment;

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
			this.selection = "rock";
			break;
		case 2:
			this.selection = "paper";
			break;
		case 3:
			this.selection = "scissors";
			break;
		case 4:
			this.selection = "lizard";
			break;
		case 5:
			this.selection = "spock";
			break;
		}

	}

}
