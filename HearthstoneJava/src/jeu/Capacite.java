package jeu;

public class Capacite implements ICapacite {
	
	// Attributs
	
	private String nom;
	private String description;
	
	// Constructeur
	
	public Capacite(String n, String d) {
		setNom(n);
		setDescription(d);
	}
	
	
	// Getters
	
	public String getNom() {
		return nom;
	}
	
	public String getDescription() {
		return description;
	}

	// M�thodes
	
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
