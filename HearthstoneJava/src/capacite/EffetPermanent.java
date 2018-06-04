package capacite;

import jeu.HearthstoneException;
import carte.*;

public class EffetPermanent extends Capacite {

	private int boostPdv, boostAtt;
	
	public EffetPermanent(int bp, int ba) {
		super("Effet permanent", "Permet de modifier les caractéristiques des serviteurs en jeu, en leur ajoutant des points d'attaque et/ou de vie en bonus. L'effet disparaît lorsque la carte qui possède cette capacité n'est plus en jeu.");
		this.setBoostPdv(bp);
		this.setBoostAtt(ba);
	}
	
	public void setBoostPdv(int p) {
		this.boostPdv=p;
	}
	
	public void setBoostAtt(int a) {
		this.boostAtt=a;
	}
	
	public int getBoostPdv() {
		return this.boostPdv;
	}
	
	public int getBoostAtt() {
		return this.boostAtt;
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		((Serviteur)cible).setPdv(((Serviteur)cible).getPdv()+this.getBoostPdv());
		((Serviteur)cible).setAtt(((Serviteur)cible).getAtt()+this.getBoostAtt());
	}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {
		((Serviteur)cible).setPdv(((Serviteur)cible).getPdv()-this.getBoostPdv());
		((Serviteur)cible).setAtt(((Serviteur)cible).getAtt()-this.getBoostAtt());
	}
}
