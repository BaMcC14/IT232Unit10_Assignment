
public class baseball extends scoreKeeper {

	//*********************************************************

	//****Assignment 10 Section 2

	//*********************************************************	
	
	private int fouls = 0;
	private int balls = 0;
	private int strikes = 0;
	private int outs = 0;
	private double inning = 1;

	public void advOuts() {
		outs++;
		if (outs >= 3) {
			balls = 0;
			strikes = 0;
			outs = 0;
			inning = inning + .5;
		}
	}

	public int getOuts() {
		return outs;
	}

	public void advStrikes() {
		strikes++;
		if(strikes >= 3) {
			advOuts();
		}
	}
	
	public int getStrike() {
		return strikes;
	}
	
	public void advFouls() {
		fouls++;
		if(strikes < 2) {
			strikes++;
		}
	}
	
	public int getFouls() {
		return fouls;
	}
	
	public void advBalls() {
		balls++;
		if(balls == 4) {
			balls = 0;
			strikes = 0;
			fouls = 0;
		}
	}
	
	public int getBalls() {
		return balls;
	}
	
	public double getInning() {
		return inning;
	}
	
	//Constructors
	public baseball() {
		
	}
	
	public baseball(String homeTeam, String visitingTeam) {
		setGame(homeTeam + " vs " + visitingTeam);
		addName(homeTeam);
		addName(visitingTeam);
	}

}// end of class baseball
