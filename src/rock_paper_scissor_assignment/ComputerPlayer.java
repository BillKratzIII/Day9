package rock_paper_scissor_assignment;

public class ComputerPlayer extends Player {

	public ComputerPlayer() {
	}

	@Override
	public void takeATurn() {
		int temp = (int) ((Math.random() * 3) + 1);
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
		}
		

	}

}
