package capacite;

import jeu.HearthstoneException;

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
		return " - Capacité [ Nom : " + this.getNom() + " - Description : " + this.getDescription() + " ]";
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {
		// TODO Auto-generated method stub

	}

}
