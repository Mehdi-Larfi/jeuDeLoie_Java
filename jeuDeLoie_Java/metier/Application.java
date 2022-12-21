package metier;

import jeuDeLoie.Game;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		try{
			game.start();
		}catch(Exception e){
			System.err.println("Erreur");
		}finally {
			System.out.println("End");
		}
	}

}
