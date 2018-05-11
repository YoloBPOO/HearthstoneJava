package capacite;

import jeu.HearthstoneException;

public class AttaqueDuHeros extends Capacite {

	public AttaqueDuHeros() {
		super("Attaque du Heros", "Permet à la carte qui la possède, d'attaquer le héros adverse, en toute circonstance, y compris lorsque le héros est protégé par la provocation.");
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
