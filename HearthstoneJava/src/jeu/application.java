package jeu;

import carte.*;
import java.util.ArrayList;
import java.util.Scanner;

import capacite.*;


public class application {

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
			joueur1.creationDeckMage(joueur1);
			joueur1.melanger();	
		}
		else {
			joueur1 = new Joueur(rexxar,pseudoJ1,0,0);
			joueur1.creationDeckChasseur(joueur1);
			joueur1.melanger();	
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
			joueur2.creationDeckMage(joueur2);
			joueur2.melanger();
		}
		else {
			joueur2 = new Joueur(rexxar,pseudoJ2,0,0);
			joueur2.creationDeckChasseur(joueur2);
			joueur2.melanger();
		}		
				
		Plateau.getInstance().ajouterJoueur(joueur1);
		Plateau.getInstance().ajouterJoueur(joueur2);
		
		System.out.println("Le combat oppose " + pseudoJ1 + " qui incarne " + joueur1.getHeros() + " contre " + pseudoJ2 + " qui incarne " + joueur2.getHeros());
			
		
		
		for(i=0 ; i<2 ; i++)
		{
			joueur1.piocher();
			joueur2.piocher();
		}
				
		System.out.println("Joueur 1 carte en main :");		
		for(i=0 ; i < joueur1.main.size() ; i++)
		{
			System.out.println(joueur1.main.get(i));
		}
			
		System.out.println("Joueur 2 carte en main : ");
		for(i=0 ; i < joueur2.main.size() ; i++)
		{
			System.out.println(joueur2.main.get(i));
		}

			
			
	}
	
}