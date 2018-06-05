package capacite;

import jeu.HearthstoneException;

/**
* Capacite: Gere les capacites de toute les carte
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/

public class Capacite implements ICapacite {
	
	// Attributs
	
	private String nom;
	private String description;
	
	// Constructeur
	
	public Capacite(String n, String d) {
		this.setNom(n);
		this.setDescription(d);
	}
	
	// Setters
	
	public void setNom(String n) {
		this.nom=n;
	}


	public void setDescription(String d) {
		this.description=d;
	}

	// Getters

	public String getNom() {
		return nom;
	}
	
	public String getDescription() {
		return description;
	}

	// Méthodes
	
	public String toString() {
		return " - Capacité [" + this.getNom() + " --> " + this.getDescription() + " ]";
	}
	
	public boolean equals(Object o) {
		if (this==o) 
			return true;
		if (o==null)
			return false;
		if (!(o instanceof ICapacite))
			return false;
		
		Capacite other = (Capacite) o;
		
		if (other.getNom()==this.getNom()) 
			return true;
		
		return false;
	}
	
	public void executerEffetDebutTour() throws HearthstoneException {}

	public void executerEffetFinTour() throws HearthstoneException {}

	public void executerAction(Object cible) throws HearthstoneException {}

	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {}

	public void executerEffetDisparition(Object cible) throws HearthstoneException {}

}
