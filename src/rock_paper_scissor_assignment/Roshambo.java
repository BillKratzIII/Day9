package rock_paper_scissor_assignment;

import java.util.Scanner;

public class Roshambo {

	public static void main(String[] args) {
		String userName = null;

		// Get user's name and create new user
		userName = getUserName();

		// game method to take in the user's name and begin game
		game(userName);

	}

	// mothod to create a user, create a computer player and play rock, paper,
	// scissors until the
	// user decides to quit.
	public static void game(String userName) {
		int opponentChoice = 0;
		String userInput = null;
		String userChoice = null;
		String computerChoice = null;
		String[] opponents = { "Erin", "Mary", "Tucker", "Beth", "John", "Brendan", "Forrest", "Roland", "David",
				"Chris" };

		// Instantiate user and computer player objects
		User user = new User(userName);
		ComputerPlayer player = new ComputerPlayer();

		// Ask player to choose an opponent
		opponentChoice = chooseOpponent();
		player.setName(opponents[opponentChoice - 1]);
		System.out.println("The matchup is " + user.getName() + " vs " + opponents[opponentChoice - 1]);

		do {
			// Ask user for a selection: rock, paper, scissors or quit
			user.takeATurn();
			userChoice = user.getSelection();
			// Generate a random player choice
			player.takeATurn();
			computerChoice = player.getSelection();

			if ((user.getSelection().equalsIgnoreCase("choose")) != true
					&& (user.getSelection().equalsIgnoreCase("quit") != true)) {
				System.out.println(user.getName() + " chooses " + user.getSelection());
				System.out.println(player.getName() + " chooses " + player.getSelection());
			}
			// call method to compare user and player choices
			play(userChoice, computerChoice, user.getName());
		} while (user.getSelection().equalsIgnoreCase("quit") == false);
	}

	// method to print out list of possible opponenets
	public static void printList() {
		System.out.println("1 - Erin");
		System.out.println("2 - Mary");
		System.out.println("3 - Tucker");
		System.out.println("4 - Beth");
		System.out.println("5 - John");
		System.out.println("6 - Brendan");
		System.out.println("7 - Forrest");
		System.out.println("8 - Roland");
		System.out.println("9 - David");
		System.out.println("10 - Chris");
	}

	// method to prompt user to choose their opponent, checks to ensure the user
	// makes a valid selection
	// continue to play game until the user asks to choose another opponent or
	// to quit
	public static int chooseOpponent() {
		Scanner sc = new Scanner(System.in);
		String userInput = null;
		int temp = 0;
		do {
			System.out.println("Please choose your opponent by entering their number:");
			printList();
			userInput = sc.nextLine();
		} while (Validation.isValidOpponent(userInput));

		temp = Integer.parseInt(userInput);
		return temp;
	}

	// method to prompt the user to enter their name and store it in a variable
	public static String getUserName() {
		Scanner sc = new Scanner(System.in);
		String userInput = null;
		System.out.println("Please enter your name:");
		userInput = sc.nextLine();
		return userInput;
	}

	// method to take in user's choice and the computer player's random choice,
	// compare them, and display the result
	public static void play(String userEntry, String computerEntry, String userName) {
		String key = userEntry.toLowerCase();
		String key2 = computerEntry.toLowerCase();

		switch (key) {
		case "rock":
			switch (key2) {
			case "paper":
				System.out.println("You lose, paper beats rock!");
				break;
			case "scissors":
				System.out.println("You win, rock beats scissors!");
				break;
			case "lizard":
				System.out.println("You win, rock beats lizard!");
				break;
			case "spock":
				System.out.println("You lose, spock beats rock!");
				break;
			default:
				System.out.println("The result is a tie!");
				break;
			}
			break;
		case "paper":
			switch (key2) {
			case "rock":
				System.out.println("You win, paper beats rock!");
				break;
			case "scissors":
				System.out.println("You lose, scissors beats paper!");
				break;
			case "lizard":
				System.out.println("You lose, lizard beats paper!");
				break;
			case "spock":
				System.out.println("You lose, spock beats paper!");
				break;
			default:
				System.out.println("The result is a tie!");
				break;
			}
			break;
		case "scissors":
			switch (key2) {
			case "paper":
				System.out.println("You win, scissors beats paper!");
				break;
			case "rock":
				System.out.println("You lose, rock beats scissors!");
				break;
			case "lizard":
				System.out.println("You win, scissors beats lizard!");
				break;
			case "spock":
				System.out.println("You lose, spock beats scissors!");
				break;
			default:
				System.out.println("The result is a tie!");
				break;
			}
			break;
		case "lizard":
			switch (key2) {
			case "rock":
				System.out.println("You lose, rock beats lizard!");
				break;
			case "scissors":
				System.out.println("You lose, scissors beats lizard!");
				break;
			case "paper":
				System.out.println("You win, lizard beats paper!");
				break;
			case "spock":
				System.out.println("You win, lizard beats spock!");
				break;
			default:
				System.out.println("The result is a tie!");
				break;
			}
			break;
		case "spock":
			switch (key2) {
			case "lizard":
				System.out.println("You lose, lizard beats spock!");
				break;
			case "scissors":
				System.out.println("You win, spock beats scissors!");
				break;
			case "rock":
				System.out.println("You win, spock beats rock!");
				break;
			case "paper":
				System.out.println("You win, spock beats paper!");
				break;
			default:
				System.out.println("The result is a tie!");
				break;
			}
			break;
		case "choose":
			System.out.println();
			game(userName);
			break;
		default:
			System.out.println();
			System.out.println("Thank you for playing, goodbye!");
			System.exit(0);
			break;
		}
	}

}
