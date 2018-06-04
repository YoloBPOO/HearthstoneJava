package capacite;

import jeu.HearthstoneException;

public class Provocation extends Capacite {

	public Provocation() {
		super("Provocation", "Oblige les serviteurs a l'attaquer");
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
