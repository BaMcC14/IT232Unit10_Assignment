import java.util.ArrayList;

public class scoreKeeper {

	//*********************************************************

	//****Assignment 10 Section 1

	//*********************************************************	
	
	private String gamePlayed;

	class playerNscore {
	
		public String name;
		public Integer score;
		
		public playerNscore(String n, int s) {
			name = n;
			score = s;
		}
	}
	ArrayList<playerNscore> players = new ArrayList<playerNscore>();

	public void addName(String name){
		players.add(new playerNscore(name,0));
	}
	
	public String getPlayerName(int playerNum ) {
		return players.get(playerNum -1).name;
	}
	
	public void setGame(String name) {
		gamePlayed = name;
	}
	
	public String getGame() {
		return gamePlayed;
	}
	
	public int addScore(String player, int points) {
		
		int temp = -999;
		for(int i = 0; i < players.size(); i++) {
			if(players.get(i).name == player) {
				players.get(i).score += points;
				temp = players.get(i).score;
				break;
			}
		}
		return temp;	
	}
	
	public int subScore(String player, int points) {
		
		int temp = -999;
		for(int i  = 0; i < players.size(); i++) {
			if(players.get(i).name == player) {
				players.get(i).score -= points;
				temp = players.get(i).score;
				break;
			}
		}
		return temp;
	}
	
	public int getScore(String player) {
		int temp = -999;
		for (int i = 0; i < players.size(); i++) {
			if(players.get(i).name == player) {
				temp = players.get(i).score;
				break;
			}
		}
		return temp;
	}
	
	public void listAllScore() {
		System.out.println("The scores for " + gamePlayed + ": ");
		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i).name + "'s score is " + players.get(i).score);
		}
	}
	
	public scoreKeeper() {
		
	}
	
	public scoreKeeper(String game) {
		setGame(game);
	}
	
}//end class scoreKeeper
