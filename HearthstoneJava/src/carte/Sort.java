package carte;

import capacite.*;
import jeu.*;

public class Sort extends Carte {

	public Sort(String n, int c, IJoueur p, ICapacite capacite) {
		super(n, c, p, capacite);
	}
	
	public String toString() {
		String s="Sort [" + super.toString();
		if (this.getCapacite() != null)
			s+=this.getCapacite();
		s+= "]\n";
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
