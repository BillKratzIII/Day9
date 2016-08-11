package rock_paper_scissor_assignment;

import java.util.Scanner;

public class Roshambo {

	public static void main(String[] args) {
		int opponentChoice = 0;
		String userName = null;
		String userInput = null;
		String userChoice = null;
		String computerChoice = null;
		String[] opponents = {"Erin", "Mary", "Tucker", "Beth", "John", "Brendan", "Forrest", "Roland", "David", "Chris"};
		
		//Get user's name and create new user
		userName = getUserName();
		User user = new User(userName);
		ComputerPlayer player = new ComputerPlayer();
		
		//Ask player to choose an opponent
		opponentChoice = chooseOpponent();
		player.setName(opponents[opponentChoice-1]);
		System.out.println("The matchup is " + user.getName() + " vs " + opponents[opponentChoice-1]);
		
		//Ask player for a selection: rock, paper, scissors or quit
		do{
		user.takeATurn();
		userChoice = user.getSelection();
		System.out.println(user.getName() + " chooses " + user.getSelection());
		player.takeATurn();
		computerChoice = player.getSelection();
		System.out.println(player.getName() + " chooses " + player.getSelection());
		user.isPlaying = play(userChoice, computerChoice);
		}while(user.getIsPlaying());

	}
	
	public static void printList(){
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
	
	public static int chooseOpponent(){
		Scanner sc = new Scanner(System.in);
		String userInput = null;
		int temp = 0;
		do{
		System.out.println("Please choose your opponent by entering their number:");
		printList();
		userInput = sc.nextLine();
		}while(Validation.isValidOpponent(userInput));
			
		temp = Integer.parseInt(userInput);
		return temp;
	}
	
	public static String getUserName(){
		Scanner sc = new Scanner(System.in);
		String userInput = null;
		System.out.println("Please enter your name:");
		userInput = sc.nextLine();
		return userInput;
	}
	
	public static boolean play(String userEntry, String computerEntry){
		String key = userEntry.toLowerCase();
		String key2 = computerEntry.toLowerCase();
		boolean stillPlaying = true;
		
		switch (key) {
		case "rock":
			switch (key2){
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
			switch (key2){
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
			switch (key2){
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
				switch (key2){
				case "paper":
					System.out.println("You win, lizard beats paper!");
					break;
				case "lizard":
					System.out.println("The result is a tie!");
					break;
				default:
					System.out.println("You lose!");
					break;
				}
			break;
		case "spock":
			switch (key2){
			case "lizard":
				System.out.println("You lose, lizard beats spock!");
				break;
			case "spock":
				System.out.println("The result is a tie!");
				break;
			default:
				System.out.println("You win!");
				break;
			}
			break;
		default:
			System.out.println();
			System.out.println("Thank you for playing, goodbye!");
			stillPlaying = false;
			break;
		}
		return stillPlaying;
	}
	

}
