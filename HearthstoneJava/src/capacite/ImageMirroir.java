package capacite;

import carte.Serviteur;
import jeu.*;

public class ImageMirroir extends InvocationDeServiteurs {

	public ImageMirroir(IJoueur joueur) {
		super("Image Miroir", "Invoque 2 serviteurs 0/2 avec la capacite Provocation", new Serviteur("Image Remanente", 0, joueur, 2, 0, new Provocation()), 2);
	}
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		super.executerAction(cible);
	}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
