package capacite;

import jeu.HearthstoneException;
import carte.*;

public class Charge extends Capacite {

	public Charge() {
		super("Charge", "Permet au serviteur cible d'attaquer pendant son tour de stase");
	}
	
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		((Serviteur)cible).setJouable(true);
	}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}

}
