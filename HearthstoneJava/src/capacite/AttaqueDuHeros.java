package capacite;

import jeu.*;

public class AttaqueDuHeros extends Attaque {

	public AttaqueDuHeros(int d) {
		super("Attaque du Heros", "Permet à la carte qui la possède, d'attaquer le héros adverse, en toute circonstance, y compris lorsque le héros est protégé par la provocation.",d);
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {
		Heros adv = (Plateau.getAdversaire(Plateau.getJoueurCourant()).getHeros());
		adv.setPdv(adv.getPdv() - this.getDegat());
	}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
