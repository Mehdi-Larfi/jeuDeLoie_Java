package utils;



public class Dice {
	
	
	public static  Double throwDice() {
		
		double dice = Math.floor(Math.random() *(6 - 1) +1);
		return dice;
	}

}
