package rock_paper_scissor_assignment;

public abstract class Player {
	String name = null;
	String selection = null;
	
	public Player(String name) {
		this.name = name;
	}

	public Player() {
	}

	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getSelection(){
		return this.selection;
	}

	public abstract void takeATurn();

}
