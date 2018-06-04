package jeu;

import capacite.Capacite;

public class Heros {
	
	// Attributs
	
	private String nom;
	private int pdv;
	private Capacite pouvoir;
	private boolean pouvoirJouable;
	
	// Constructeur
	
	public Heros(String n, int pdv, Capacite p) {
		setNom(n);
		setPdv(pdv);
		setPouvoir(p);
	}
	
	// Setters
	
	public void setNom(String n) {
		this.nom=n;
	}
	
	public void setPdv(int pdv) {
		this.pdv=pdv;
	}
	
	public void setPouvoir(Capacite p) {
		this.pouvoir=p;
	}
	
	public void setPouvoirJouable(boolean b) {
		this.pouvoirJouable=b;
	}
	// Getters
	
	public String getNom() {
		return nom;
	}
	
	public int getPdv() {
		return pdv;
	}
	
	public Capacite getCapacite() {
		return pouvoir;
	}
	
	public boolean getPouvoirJouable() {
		return pouvoirJouable;
	}
	
	public String toString() {
		return "Heros [Nom : " + this.getNom() + " - PDV : " + this.getPdv() + " - Pouvoir Heroique : " + getCapacite() +".]";
	}
}
