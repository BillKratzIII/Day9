package rock_paper_scissor_assignment;

import java.util.Scanner;

public class User extends Player{
	boolean isPlaying = true;
	
	public User(String name) {
		super(name);
	}
	
	public boolean getIsPlaying(){
		return isPlaying;
	}

	@Override
	public void takeATurn() {
		Scanner sc = new Scanner(System.in);
		String userInput = null;
		String option = null;
		do{
			printOptions();
			userInput = sc.nextLine();
		}while(Validation.isValidSelection(userInput));
		this.selection = userInput;		
	}
	
	public static void printOptions(){
		System.out.println("Please enter your choice: rock, paper, scissors, or quit");
	}

}
