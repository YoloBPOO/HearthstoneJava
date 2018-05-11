package carte;

import jeu.IJoueur;

public class Serviteur extends Carte {
	
	private boolean jouable;
	private int pdv, att;

	public Serviteur(String n, int c, IJoueur p) {
		super(n, c, p);
		this.setJouable(false);
	}
	
	public void setPdv(int p) {
		this.pdv=p;
	}
	
	public void setAtt(int a) {
		this.att=a;
	}

	public void setJouable(boolean b) {
		this.jouable=b;
	}
	
	public int getPdv() {
		return this.pdv;
	}
	
	public int getAtt() {
		return this.att;
	}
	
	public boolean getJouable() {
		return this.jouable;
	}

}
