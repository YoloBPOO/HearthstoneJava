package capacite;

import carte.Serviteur;
import jeu.HearthstoneException;

public class Provocation extends Capacite {

	public Provocation() {
		super("Provocation", "Le héros ne peut pas être victime d'une attaque tant que l'un de ses serviteurs ayant la provocation est présent sur le plateau.");
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
