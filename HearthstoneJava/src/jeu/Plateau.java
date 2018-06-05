package jeu;

import java.util.ArrayList;
/**
* Plateau: cette classe gere le plateau
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see jeu
*/
public class Plateau implements IPlateau {
	private static IPlateau inPlateau = null;
	private ArrayList<IJoueur> joueurs = new ArrayList<IJoueur>();
	private IJoueur joueurCourant = null;
	private boolean demarrer = false;

	public void ajouterJoueur(IJoueur joueur) throws HearthstoneException {
		if (joueur==null) 
			throw new HearthstoneException("Joueur vide");
		if (joueurs.size() == 2) 
			throw new HearthstoneException("Joueur max atteind");
		if (joueurs.contains(joueur))
			throw new HearthstoneException("Vous ne pouvez pas choisir le même heros que votre adversaire");
		joueurs.add(joueur);
	}
	
	//getter

	public IJoueur getJoueurCourant() {
		return this.joueurCourant;
	}
	
	public IJoueur getAdversaire(IJoueur joueur) throws HearthstoneException {
		if(joueur==null) 
			throw new HearthstoneException("Pas de joueur");
		if(!joueurs.contains(joueur)) 
			throw new HearthstoneException("Le joueur n'existe pas");
		if(this.getJoueurCourant() == joueurs.get(0)) 
			return this.joueurs.get(1);
		else
			return this.joueurs.get(0);
	}

	
	//setter

	public void setJoueurCourant(IJoueur joueur) throws HearthstoneException {
		this.joueurCourant=joueur;
	}

	// methode

	public void demarrerPartie() throws HearthstoneException {
		if(this.joueurs.size()!=2) 
			throw new HearthstoneException("Il faut 2 joueurs pour demarrer une partie");
		this.demarrer=true;
		
		this.setJoueurCourant(joueurs.get(0));
		this.getJoueurCourant().prendreTour();
	}
	
	public boolean estDemarree() {
		return this.demarrer;
	}

	public void finTour(IJoueur joueur) throws HearthstoneException {
		this.setJoueurCourant(this.getAdversaire(joueur));
		this.getJoueurCourant().prendreTour();
	}

	public void gagnePartie(IJoueur joueur) throws HearthstoneException {
		System.out.println(this.getJoueurCourant().getPseudo()+" a gagné la partie ! Bravo !");
		this.demarrer=false;
	}
	
	public static IPlateau getInstance() {
		if(inPlateau==null)
		inPlateau = new Plateau();
		return inPlateau;
}

}
