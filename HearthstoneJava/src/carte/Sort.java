package carte;

import capacite.*;
import jeu.*;

public class Sort extends Carte {
	
	private Capacite capacite;

	public Sort(String n, int c, IJoueur p, Capacite capacite) {
		super(n, c, p, capacite);
	}
	
	public void setCapacite(Capacite c) {
		this.capacite=c;
	}
	
	public Capacite getCapacite() {
		return this.capacite;
	}
	
	public String toString() {
		String s="Sort [" + super.toString();
		if (this.getCapacite() != null)
			s+= " Capacite " +this.getCapacite();
		s+= "]";
		return s;
	}

	public void executerEffetDebutTour(Object cible) throws HearthstoneException {}

	public void executerEffetFinTour(Object cible) throws HearthstoneException {}

	public void executerEffetDebutMiseEnJeu(Object cible) throws HearthstoneException {
		this.getCapacite().executerAction(cible);
	}

	public void executerEffetDisparition(Object cible) throws HearthstoneException {}

	public void executerAction(Object cible) throws HearthstoneException {}

	public boolean disparait() {
		return false;
	}

}
