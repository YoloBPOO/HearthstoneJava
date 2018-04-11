package jeu;

import java.util.Scanner;

public class Plateau implements IPlateau {

	@Override
	public void ajouterJoueur(IJoueur joueur) throws HearthstoneException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String p, choix;
		
		Heros h;
		
		System.out.println("Entrez un pseudo : ");
		p=sc.nextLine();
		
		System.out.println("Choisisez un héros : Jaina (J) ou Rexxar (R)");
		choix=sc.nextLine();
		
		if (choix=="J") {
			h.Heros("Jaina", 15, BouleDeFeu);
		}
		else h.Heros("Rexxar", 15, TirAssure);
		
		joueur.Joueur(h, p, 0, 0);
	}

	@Override
	public IJoueur getJoueurCourant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setJoueurCourant(IJoueur joueur) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public IJoueur getAdversaire(IJoueur joueur) throws HearthstoneException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void demarrerPartie() throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean estDemarree() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void finTour(IJoueur joueur) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void gagnePartie(IJoueur joueur) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

}
