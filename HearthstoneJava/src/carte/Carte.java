package carte;

import jeu.HearthstoneException;
import jeu.IJoueur;

public class Carte implements ICarte {
	private String nom;
	private int cout;
	private IJoueur proprietaire;
	
	// Constructeur
	
	public Carte(String n, int c, IJoueur p) {
		setNom(n);
		setCout(c);
		setProprietaire(p);
	}

	// Setters
	
	public void setNom(String n) {
		this.nom=n;
	}
	
	public void setCout(int c) {
		this.cout=c;
	}
	
	public void setProprietaire(IJoueur p) {
		this.proprietaire=p;
	}
	
	// Getters

	public String getNom() {
		return nom;
	}

	public int getCout() {
		return cout;
	}

	public IJoueur getProprietaire() {
		return proprietaire;
	}
	
	// Méthodes
	
	public String toString() {
		return "Nom : " + this.getNom() + " - Cout : " + this.getCout();
	}

	@Override
	public void executerEffetDebutTour(Object cible) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void executerEffetFinTour(Object cible) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void executerEffetDebutMiseEnJeu(Object cible) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {
		// TODO Auto-generated method stub

	}
}
