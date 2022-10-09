
public class IT232_McCann_Unit10 {

	public static void main(String[] args) {
		
		//*********************************************************

		//****Assignment 10 Section 3

		//*********************************************************	
		
		System.out.println("Assignment 10 - Classes and Inheritance\n");
		System.out.println("Section 3: Base Class Results After Adding\n");
		
		scoreKeeper gameOne = new scoreKeeper("Canasta");
		gameOne.addName("Larry");
		gameOne.addName("Moe");
		gameOne.addName("Curly");
		
		System.out.println();
		
		gameOne.addScore("Larry", 20);
		gameOne.addScore("Moe", 35);
		gameOne.addScore("Curly", 45);
		
		gameOne.listAllScore();
		
		gameOne.subScore("Moe", 15);
		gameOne.subScore("Curly", 5);
		
		System.out.println();
		System.out.println("Section 3: Base Class Results After Subtracting\n");
		
		gameOne.listAllScore();
		
		System.out.println();
		System.out.println();
		
		
		//*********************************************************

		//****Assignment 10 Section 4

		//*********************************************************
		
		System.out.println("Section 4: Derived Class Results: Baseball scoring\n");
		baseball gameTwo = new baseball("Cubs", "Braves");
		
		gameTwo.addScore("Cubs", 2);
		gameTwo.advOuts();
		gameTwo.advOuts();
		gameTwo.advOuts();
		gameTwo.addScore("Braves", 3);
		gameTwo.advOuts();
		gameTwo.advStrikes();
		gameTwo.advFouls();
		gameTwo.advFouls();
		gameTwo.advFouls();
		gameTwo.advBalls();
		gameTwo.listAllScore();
		System.out.println();
		
		System.out.println("The inning is: " + gameTwo.getInning());
		System.out.println("Outs: " + gameTwo.getOuts());
		System.out.println("Strikes " + gameTwo.getStrike());
		System.out.println("Fouls " + gameTwo.getFouls());
		System.out.println("Balls " + gameTwo.getBalls());
		
		
		
		
		
	}

}
