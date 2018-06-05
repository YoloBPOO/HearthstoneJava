package capacite;

import carte.ICarte;
import carte.Serviteur;
import jeu.HearthstoneException;
import jeu.Heros;
/**
* BouleDeFeu : Pouvoir heroique du mage, inflige un point de degat à la cible
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
public class BouleDeFeu extends Attaque {

	public BouleDeFeu() {
		super("Attaque ciblee", "Inflige 1 point de degat à la cible", 1);
	}
	
	public void executerEffetDebutTour() throws HearthstoneException {}

	public void executerEffetFinTour() throws HearthstoneException {}

	public void executerAction(Object cible) throws HearthstoneException {
		if (cible == null)
			throw new HearthstoneException ("Aucune cible");
		
		if (cible instanceof Heros)
			((Heros) cible).setPdv(((Heros) cible).getPdv()-getDegat());
		else {
			((Serviteur) cible).setPdv(((Serviteur) cible).getPdv()-getDegat());
			if (((Serviteur) cible).disparait())
				((Serviteur) cible).getProprietaire().perdreCarte((ICarte) cible);
		}
	}
	

	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		this.executerAction(cible);
	}

	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
