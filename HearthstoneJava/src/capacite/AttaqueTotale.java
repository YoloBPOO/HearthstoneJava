package capacite;

import jeu.HearthstoneException;

public class AttaqueTotale extends Capacite {

	public AttaqueTotale() {
		super("Attaque totale", "Permet � la carte qui la poss�de d'attaquer simultan�ment tous les serviteurs adverses");
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
