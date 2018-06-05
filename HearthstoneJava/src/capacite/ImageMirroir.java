package capacite;
/**
* ImageMirroir: Invoque 2 image remanente avec provocation
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
import carte.Serviteur;
import jeu.*;

public class ImageMirroir extends InvocationDeServiteurs {

	public ImageMirroir(IJoueur joueur) {
		super("Image Miroir", "Invoque 2 serviteurs 0/2 avec la capacite Provocation", new Serviteur("Image Remanente", 0, joueur, 2, 0, new Provocation()), 2);
	}

	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		super.executerAction(cible);
	}
}
