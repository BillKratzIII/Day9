package rock_paper_scissor_assignment;

import rock_paper_scissor_assignment.Choices.roshambo;

public abstract class Player {
	String name = null;
	roshambo selection = null;

	// constructor
	public Player(String name) {
		this.name = name;
	}

	// empty constructor
	public Player() {
	}

	// method to return the player's name
	public String getName() {
		return this.name;
	}

	// method to set the player's name
	public void setName(String name) {
		this.name = name;
	}

	// method to return the player's selection
	public roshambo getSelection() {
		return this.selection;
	}

	// abstract method to take a turn, written differently for users vs computer
	// players
	public abstract void takeATurn();

}
