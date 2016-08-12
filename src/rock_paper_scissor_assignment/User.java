package rock_paper_scissor_assignment;

import java.util.Scanner;

import rock_paper_scissor_assignment.Choices.roshambo;

public class User extends Player {

	// constructor
	public User(String name) {
		super(name);
	}

	// method to ask user for their choice, check to ensure it's valid then set
	// it to user's selection
	@Override
	public void takeATurn() {
		roshambo temp = null;
		roshambo[] validOptions = roshambo.values();
		Scanner sc = new Scanner(System.in);
		String userInput = null;
		String option = null;

		// get player selection, repeat if necessary until player enters a valid
		// selection
		do {
			printOptions();
			userInput = sc.nextLine();
		} while (Validation.isValidSelection(userInput));

		// search array of roshambo choices until one is matched to the user's
		// input
		for (int i = 0; i < validOptions.length; i++) {
			if (userInput.equalsIgnoreCase(validOptions[i].toString())) {
				temp = validOptions[i];
			}
		}

		// set roshambo selection equal to the input string we matched up
		this.selection = temp;
	}

	// method to display options user can choose in game
	public static void printOptions() {
		System.out.println();
		System.out.println("To play enter your choice of: rock, paper, scissors, lizard, or spock");
		System.out.println("To choose a new opponent enter: choose");
		System.out.println("To exit the program enter: quit");
	}

}
