package capacite;

import jeu.*;

public class AttaqueDuHeros extends Attaque {

	public AttaqueDuHeros(int d) {
		super("Attaque du Heros", "Inflige "+d+" points de degat au heros adverse",d);
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {
		Heros adv = Plateau.getInstance().getAdversaire(Plateau.getInstance().getJoueurCourant()).getHeros();
		adv.setPdv(adv.getPdv() - this.getDegat());
	}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
