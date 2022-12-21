package jeuDeLoie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreTotal extends Joueur {
	
	private ArrayList<Joueur> tableauDesScores = new ArrayList<Joueur>();
	

	public ScoreTotal(String name,  String colour, int timetries) {
		super(name, colour, timetries);
		
		if(isWin()) {
		Joueur player = new Joueur(name, colour, timetries);
		tableauDesScores.add(player);
		}
	}
	

	public ArrayList<Joueur> getTableauDesScores() {
		return tableauDesScores;
	}


	public void setTableauDesScores(String name,  String colour, int timetries) {
		if(!verify( name, colour, timetries)) {Joueur player = new Joueur(name, colour, timetries);
		tableauDesScores.add(player);
		Collections.sort(tableauDesScores);
		}
	}
	
	public boolean verify(String name, String colour, int timetries) {
		boolean exist = false;
		Joueur player = new Joueur(name, colour, timetries);
		
			
			if (tableauDesScores.equals(player) ) { 
				exist = true ;			
			
		}
	
		if (exist) System.out.println("Déjà enregistré !"); 
			
		return exist;
	}


	@Override
	public String toString() {
		return "tableau Des Scores [tableau Des Scores: \n" + tableauDesScores + "] \n";
	}
	

}
