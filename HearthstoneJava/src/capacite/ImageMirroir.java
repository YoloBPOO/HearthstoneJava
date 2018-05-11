package capacite;

import carte.Serviteur;
import jeu.HearthstoneException;
import jeu.Joueur;

public class ImageMirroir extends Capacite {

	public ImageMirroir(String n, String d) {
		super("Image mirroir", "La carte possédant cette capacité invoque automatiquement, au début du tour, deux serviteurs 0/+2 avec la capacité \"Provocation\".");
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		Provocation p = new Provocation();
		Serviteur s = new Serviteur("Image",0,((Joueur)cible),2,0,p);
	}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
