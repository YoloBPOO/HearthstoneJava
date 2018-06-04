package capacite;

import carte.ICarte;
import carte.Serviteur;
import jeu.HearthstoneException;
import jeu.Heros;

public class BouleDeFeu extends Attaque {

	public BouleDeFeu() {
		super("Attaque ciblee", "Inflige 1 point de degat � la cible", 1);
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
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
	

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		this.executerAction(cible);
	}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
