package capacite;

import jeu.HearthstoneException;

public class FlecheDuChasseur extends Capacite {

	public FlecheDuChasseur() {
		super("Fleche du Chasseur", "Inflige 2 points de degat au hero adverse.");
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
