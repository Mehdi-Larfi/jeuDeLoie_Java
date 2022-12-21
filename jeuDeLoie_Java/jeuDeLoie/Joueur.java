package jeuDeLoie;

import utils.Constantes;
import utils.Dice;

public class Joueur implements java.lang.Comparable<Joueur>{
	private String name;
	private String colour;
	private double score;
	private double startPosition;
	private double nouvellePosition;
	private int timetries;
	private boolean win = false;

	
	public Joueur(String name, String colour) {
		this.name = name;
		this.colour = colour;
	}
	
	
	
	public Joueur(String name, String colour, int timetries) {
		super();
		this.name = name;
		this.colour = colour;
		this.timetries = timetries;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getScore() {
		return score;
	}
	public boolean setPosition() {
		double dice = Dice.throwDice();
		this.score = dice;
		this.startPosition = this.startPosition +( this.score - dice);
		this.nouvellePosition= this.score + this.startPosition;
		this.timetries++;
		
		
		if(this.nouvellePosition  > Constantes.GOAL) this.nouvellePosition = Constantes.GOAL+(Constantes.GOAL- this.nouvellePosition) ;
		
		return win = nouvellePosition==Constantes.GOAL ? true : false; 
	}
	public double getStartPosition() {
		return startPosition;
	}
	public void setStartPosition() {
		this.startPosition = this.nouvellePosition;
	}

	public int getTimetries() {
		return timetries;
	}
	

	public double getNouvellePosition() {
		return nouvellePosition;
	}

	public boolean isWin() {
		if(win) System.out.println("Felicitations Vous avez gagné au bout de " + this.timetries + " essais.") ;
		return win;
	}


	public void setWin(boolean win) {
		this.win = win;
	}


	@Override
	public String toString() {
		if (isWin() == true) 
			return "joueur name=" + name + ",\n colour=" + colour  + "\n Nombre d'essai=" + timetries + "\n";
		else
			return "joueur name=" + name + ",\n colour=" + colour  + "\n startPosition=" + startPosition + "\n score=" + score + "\n nouvellePosition" + nouvellePosition
					+ "\n Nombre d'essai=" + timetries + "\n";
	}
	
	@Override
	public int compareTo(Joueur e) {
		return String.valueOf(this.getTimetries()).compareTo(String.valueOf(e.getTimetries()));
	}


	
	
	

}
