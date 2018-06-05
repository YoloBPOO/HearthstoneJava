package capacite;

import jeu.*;
import carte.*;
/**
* AttaqueTotale : cette  capacité  permet à  la  carte  qui  la  possède  d'attaquer simultanément tous les serviteurs adverses.
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
public class AttaqueTotale extends Attaque {

	public AttaqueTotale(int d) {
		super("Attaque totale", "Inflige "+d+" points de degats à tous les serviteurs adverses",d);
	}
	
	public void executerEffetDebutTour() throws HearthstoneException {}

	public void executerEffetFinTour() throws HearthstoneException {}

	public void executerAction(Object cible) throws HearthstoneException {
		cible=((ICarte) cible).getProprietaire();
		if(cible instanceof IJoueur) {
			for(ICarte carte : Plateau.getInstance().getAdversaire((IJoueur) cible).getJeu())
				((Serviteur) carte).setPdv(((Serviteur) carte).getPdv() - getDegat());
		}
		else 
			throw new HearthstoneException("Aucune cible");
	}

	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {}

	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
