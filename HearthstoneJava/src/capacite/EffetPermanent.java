package capacite;

import jeu.HearthstoneException;
import carte.*;
/**
* EffetPermanent: Augmente les points d'attaque et/ou de vie tant que la carte est en jeu
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
public class EffetPermanent extends Capacite {

	private int boostPdv, boostAtt;
	
	public EffetPermanent(int bp, int ba) {
		super("Effet permanent", "Augmente les points d'attaque et/ou de vie tant que la carte est en jeu");
		this.setBoostPdv(bp);
		this.setBoostAtt(ba);
	}
	
	// setter
	
	public void setBoostPdv(int p) {
		this.boostPdv=p;
	}
	
	public void setBoostAtt(int a) {
		this.boostAtt=a;
	}
	
	// getter
	
	public int getBoostPdv() {
		return this.boostPdv;
	}
	
	public int getBoostAtt() {
		return this.boostAtt;
	}
	
	// methode
	
	public void executerEffetDebutTour() throws HearthstoneException {}

	public void executerEffetFinTour() throws HearthstoneException {}

	public void executerAction(Object cible) throws HearthstoneException {}

	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		for(ICarte carte : ((ICarte)cible).getProprietaire().getJeu()) {
			((Serviteur) carte).setAtt(((Serviteur) carte).getAtt() + boostAtt);
			((Serviteur) carte).setPdv(((Serviteur) carte).getPdv() + boostPdv);
		}
	}

	public void executerEffetDisparition(Object cible) throws HearthstoneException {
		for(ICarte carte : ((ICarte)cible).getProprietaire().getJeu()) {
			((Serviteur) carte).setAtt(((Serviteur) carte).getAtt() - boostAtt);
			((Serviteur) carte).setPdv(((Serviteur) carte).getPdv() - boostPdv);
		}	
	}
}
