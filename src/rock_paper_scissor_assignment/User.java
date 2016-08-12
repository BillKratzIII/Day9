package rock_paper_scissor_assignment;

import java.util.Scanner;

public class User extends Player {

	// constructor
	public User(String name) {
		super(name);
	}

	// method to ask user for their choice, check to ensure it's valid then set
	// it to user's selection
	@Override
	public void takeATurn() {
		Scanner sc = new Scanner(System.in);
		String userInput = null;
		String option = null;
		do {
			printOptions();
			userInput = sc.nextLine();
		} while (Validation.isValidSelection(userInput));
		this.selection = userInput;
	}

	// method to display options user can choose in game
	public static void printOptions() {
		System.out.println();
		System.out.println("To play enter your choice of: rock, paper, scissors, lizard, or spock");
		System.out.println("To choose a new opponent enter: choose");
		System.out.println("To exit the program enter: quit");
	}

}
