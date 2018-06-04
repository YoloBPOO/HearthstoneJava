package jeu;

import carte.*;
import java.util.ArrayList;
import java.util.Scanner;

import capacite.*;


public class application {

	
	public static void board() throws HearthstoneException {
		
		ArrayList<ICarte> joueurCourant=Plateau.getInstance().getJoueurCourant().getMain();
		ArrayList<ICarte> joueurAdverse=Plateau.getInstance().getAdversaire(Plateau.getInstance().getJoueurCourant()).getMain();
		
		System.out.println(joueurCourant.get(0));
				
		System.out.println("_______________________________________________________");
		System.out.println("\n");
		System.out.println(Plateau.getInstance().getAdversaire(Plateau.getInstance().getJoueurCourant()));
		System.out.println("\n");
		System.out.println("_______________________________________________________");
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("\n");
		System.out.println(joueurAdverse);
		System.out.println("\n");
		System.out.println("----------------------------------------------------------");
		System.out.println("\n");
		System.out.println(joueurCourant);
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("\n");
		System.out.println("_______________________________________________________");
		System.out.println("\n");
		System.out.println(Plateau.getInstance().getJoueurCourant());
		System.out.println("\n");
		System.out.println("_______________________________________________________");
		
	}

	public static void main(String[] args) throws HearthstoneException {
		String pseudoJ1, pseudoJ2, choix;
		Scanner sc = new Scanner(System.in);
		int i;
		char carac;
		Joueur joueur1, joueur2;
		
		BouleDeFeu bdf = new BouleDeFeu();
		Heros jaina = new Heros("Jaina", 15, bdf);
		
		FlecheDuChasseur fdc = new FlecheDuChasseur();
		Heros rexxar = new Heros("Rexxar", 15, fdc);
		
		System.out.println("Entrez le pseudo du joueur 1 : ");
		pseudoJ1 = sc.nextLine();
		System.out.println("Quel Heros voulez-vous jouer (J/R) : ");
		do{
			choix = sc.nextLine();
			carac = choix.charAt(0);
		}while (carac != 'J' && carac != 'R' && carac != 'j' && carac != 'r');
				
		if (carac == 'J' || carac == 'j') {
			joueur1 = new Joueur(jaina,pseudoJ1,0,0);
			joueur1.piocher();
			joueur1.piocher();
		}
		else {
			joueur1 = new Joueur(rexxar,pseudoJ1,0,0);
			joueur1.piocher();
			joueur1.piocher();
		}
			
		
			
		System.out.println("Entrez le pseudo du joueur 2 : ");
		pseudoJ2 = sc.nextLine();
		System.out.println("Quel Heros voulez-vous jouer (J/R) : ");
		do{
			choix = sc.nextLine();
			carac = choix.charAt(0);
		}while (carac != 'J' && carac != 'R' && carac != 'j' && carac != 'r');
			
		if (carac == 'J' || carac == 'j') {
			joueur2 = new Joueur(jaina,pseudoJ2,0,0);
		}
		else {
			joueur2 = new Joueur(rexxar,pseudoJ2,0,0);
		}		
				
		Plateau.getInstance().ajouterJoueur(joueur1);
		Plateau.getInstance().ajouterJoueur(joueur2);
		
		System.out.println("Le combat oppose " + pseudoJ1 + " qui incarne " + joueur1.getHeros().getNom() + " contre " + pseudoJ2 + " qui incarne " + joueur2.getHeros().getNom());
		
		Plateau.getInstance().demarrerPartie();
		Plateau.getInstance().getJoueurCourant().piocher();
		Plateau.getInstance().getJoueurCourant().piocher();
		Plateau.getInstance().getJoueurCourant().piocher();
		System.out.println(((Joueur) Plateau.getInstance().getJoueurCourant()).getDeck().get(0));
		
		//board();
			
	}
	
}