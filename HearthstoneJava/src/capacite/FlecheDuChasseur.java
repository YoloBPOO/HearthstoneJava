package capacite;

import jeu.HearthstoneException;
import jeu.Heros;
import jeu.Plateau;
/**
* FlecheDuChasseur : Pouvoir heroique du chasseur , inflige 2 points de degats au hero adverse
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
public class FlecheDuChasseur extends Attaque {

	public FlecheDuChasseur() {
		super("Attaque du Heros", "Inflige 2 points de degat au heros adverse",2);
	}
	
	public void executerEffetDebutTour() throws HearthstoneException {}

	public void executerEffetFinTour() throws HearthstoneException {}

	public void executerAction(Object cible) throws HearthstoneException {
		Heros adv = Plateau.getInstance().getAdversaire(Plateau.getInstance().getJoueurCourant()).getHeros();
		adv.setPdv(adv.getPdv() - this.getDegat());
	}

	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {}

	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
