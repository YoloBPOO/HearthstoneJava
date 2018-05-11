package carte;

import jeu.IJoueur;
import capacite.*;

public class Serviteur extends Carte {
	
	private boolean jouable;
	private int pdv, att;
	private Capacite capacite;

	public Serviteur(String n, int c, IJoueur p, int pdv, int a, Capacite capacite) {
		super(n, c, p);
		this.setAtt(a);
		this.setPdv(pdv);
		this.setJouable(false);
		this.setCapacite(capacite);
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
	
	public void setCapacite(Capacite c) {
		this.capacite=c;
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
	
	public Capacite getCapacite() {
		return this.capacite;
	}

}
