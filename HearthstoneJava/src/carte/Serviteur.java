package carte;

import jeu.IJoueur;

public class Serviteur extends Carte {
	
	private boolean jouable;

	public Serviteur(String n, int c, IJoueur p) {
		super(n, c, p);
		this.setJouable(false);
	}

	private void setJouable(boolean b) {
		this.jouable=b;
	}

}
