package capacite;

import jeu.*;
import carte.*;

public class AttaqueTotale extends Attaque {

	public AttaqueTotale(int d) {
		super("Attaque totale", "Permet � la carte qui la poss�de d'attaquer simultan�ment tous les serviteurs adverses",d);
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {
		cible=((ICarte) cible).getProprietaire();
		if(cible instanceof IJoueur) {
			for(ICarte carte : Plateau.getInstance().getAdversaire((IJoueur) cible).getJeu())
				((Serviteur) carte).setPdv(((Serviteur) carte).getPdv() - getDegat());
		}
		else 
			throw new HearthstoneException("Aucune cible");
	}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
