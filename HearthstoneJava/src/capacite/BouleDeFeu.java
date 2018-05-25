package capacite;

import jeu.HearthstoneException;

public class BouleDeFeu extends Capacite {

	public BouleDeFeu() {
		super("Boule De Feu", "Inflige 1 points de degat a la cible.");
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
