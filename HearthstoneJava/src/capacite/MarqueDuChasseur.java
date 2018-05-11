package capacite;

import jeu.HearthstoneException;
import carte.*;

public class MarqueDuChasseur extends Capacite {

	public MarqueDuChasseur(String n, String d) {
		super("Marque du chasseur", "vise un serviteur et réduit à 1 son nombre de points de vie (quel que soit le nombre de points de vie qu'il avait au départ).");
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {
		((Serviteur)cible).setPdv(1);
	}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
