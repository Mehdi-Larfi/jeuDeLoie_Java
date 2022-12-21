package jeuDeLoie;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Game  {

	private HashMap<String, String> playerList = new HashMap<String, String>();



	public void start() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		String color;
		ScoreTotal hiscores = new  ScoreTotal("" , "", 0);
		int selection = 10;
		Joueur player = new Joueur("","");
		System.out.println("************************ \n"
						 + "*     JEU DE L'OIE     * \n"
						 + "************************ \n \n"
						 + "Bienvenue !");
		
		for(int i=0; i==0; ) {
	
		System.out.println("Entrer un nom :");
		name = br.readLine();
		System.out.println("Entrer la couleur de votre vehicule :");
		color = br.readLine();
				
		boolean check = verify(name, color);
		if(!check) player = new Joueur(name, color);

		do {		
		System.out.println("Menu\n 1 : Jouer\n 2 : Tableau des scores\n 0 : quitter");
		selection = Integer.parseInt(br.readLine());
		switch(selection) {
			case 1: while(selection !=0) { 
				player.setPosition(); 
				System.out.println(player);
				player.setStartPosition();
				
				if(player.isWin()) {hiscores.setTableauDesScores(player.getName(),  player.getColour(), player.getTimetries()); break; }
				
				System.out.println("\n Entrer 0 pour sortir ou un autre chiffre pour continuer"); 
				selection = Integer.parseInt(br.readLine());}
				break;
				
			case 2: System.out.println(hiscores); 
			break;
			
			case 0: continue;
			
			default: System.out.println("Erreur");
			break;
		}
		
		}while(selection !=0);
		
		}

		

	}
	
	public boolean verify(String name, String color) {
	 	
		boolean exist = false;		
		
			
		if (playerList.toString().equals(name)) { 
				exist = true ;			
			}
			
		
	
		if (exist) System.out.println("Ravi de vous revoir " + name); 
		else playerList.put(name, color);
			
		return exist;
	}
	
}



