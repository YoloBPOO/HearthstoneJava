package capacite;

import jeu.HearthstoneException;
/**
* Provocation: Oblige les serviteur adverse a attaqeur le serviteur avec provocation 
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
public class Provocation extends Capacite {

	public Provocation() {
		super("Provocation", "Oblige les serviteurs a l'attaquer");
	}

	public void executerEffetDebutTour() throws HearthstoneException {}

	public void executerEffetFinTour() throws HearthstoneException {}

	public void executerAction(Object cible) throws HearthstoneException {}

	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {}

	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
