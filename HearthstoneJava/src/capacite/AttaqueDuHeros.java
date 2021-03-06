package capacite;

import jeu.*;
/**
 * AttaqueDuHeros cette capacit� permet � la carte qui la poss�de, d'attaquer le h�ros adverse,  en  toute  circonstance,  y  compris  lorsque  le  h�ros  est  prot�g�  par  la provocation.
 * @author ROUSSEL - BIVER
 * @version 0.9.0
 * @see Capacite
 */
public class AttaqueDuHeros extends Attaque {

	public AttaqueDuHeros(int d) {
		super("Attaque du Heros", "Inflige "+d+" points de degat au heros adverse",d);
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
