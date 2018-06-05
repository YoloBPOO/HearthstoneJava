package carte;
/**
* Carte : gere les carte dans le jeu, sort comme serviteur
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see carte
*/
import capacite.ICapacite;
import jeu.IJoueur;

public abstract class Carte implements ICarte {
	private String nom;
	private int cout;
	private IJoueur proprietaire;
	private ICapacite capacite;
	
	// Constructeur
	
	public Carte(String n, int c, IJoueur p, ICapacite capa) {
		setNom(n);
		setCout(c);
		setProprietaire(p);
		setCapacite(capa);
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
	
	public void setCapacite(ICapacite c) {
		this.capacite=c;
	}
	
	// Getters

	public String getNom() {
		return nom;
	}

	public int getCout() {
		return cout;
	}
	
	public ICapacite getCapacite() {
		return this.capacite;
	}

	public IJoueur getProprietaire() {
		return proprietaire;
	}
	
	// Méthodes
	
	public String toString() {
		return "Nom : " + this.getNom() + " - Cout : " + this.getCout();
	}
	
	public boolean equals(Object o) {
		if (this==o) 
			return true;
		if (o==null)
			return false;
		if (!(o instanceof ICarte))
			return false;
		
		Carte other = (Carte) o;
		
		if (other.getNom()==this.getNom()) 
			return true;
		
		return false;
	}
}
