package carte;

import jeu.IJoueur;

public class Sort extends Carte {
	
	private Capacite capacite;

	public Sort(String n, int c, IJoueur p, Capacite capacite) {
		super(n, c, p);
		this.setCapacite(capacite);
		
		// TODO Auto-generated constructor stub
	}
	
	public void setCapacite(Capacite c) {
		this.capacite=c;
	}
	
	public Capacite getCapacite() {
		return this.capacite;
	}
	
	public String toString() {
		return super.toString() + (this.getCapacite()).toString();
	}

}
