package rock_paper_scissor_assignment;

import rock_paper_scissor_assignment.Choices.roshambo;

public class Validation {

	// method to ensure the user entered an integer and the value is between
	// 0-10
	public static boolean isValidOpponent(String userInput) {
		boolean isValid = true;
		int temp = 0;

		try {
			temp = Integer.parseInt(userInput);
			if (temp > 0 && temp < 11) {
				isValid = false;
			} else {
				System.out.println("Invalid selection, please enter a number 0-10");
			}
		} catch (NumberFormatException e) {
			System.out.println("Selection must be in number form, please try again.");
		}

		return isValid;
	}

	// method to ensure the user entered a valid selection for our game
	public static boolean isValidSelection(String userInput) {
		boolean validSelection = true;
		roshambo[] validOptions = roshambo.values();

		for (int i = 0; i < validOptions.length; i++) {
			if (userInput.equalsIgnoreCase(validOptions[i].toString())) {
				validSelection = false;
			}
		}

		if (validSelection) {
			System.out.println("Not a valid choice, please try again.");
		}

		return validSelection;
	}

}
