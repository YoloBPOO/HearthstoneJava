package capacite;

import jeu.HearthstoneException;

public class AttaqueDuHeros extends Capacite {

	public AttaqueDuHeros() {
		super("Attaque du Heros", "Permet � la carte qui la poss�de, d'attaquer le h�ros adverse, en toute circonstance, y compris lorsque le h�ros est prot�g� par la provocation.");
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
