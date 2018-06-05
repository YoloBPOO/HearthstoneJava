package jeu;

import capacite.Capacite;
/**
*Heros: cette classe gere la creation des deux heros
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see jeu
*/
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
	
	// methode
	
	public String toString() {
		return "Heros [Nom : " + this.getNom() + " - PDV : " + this.getPdv() + " - Pouvoir Heroique : " + getCapacite() +".]";
	}
	
	public boolean equals(Object o) {
		if (this==o) 
			return true;
		if (o==null)
			return false;
		if (!(o instanceof Heros))
			return false;
		
		Heros other = (Heros) o;
		
		if (other.getNom()==this.getNom()) 
			return true;
		
		return false;
	}
}
