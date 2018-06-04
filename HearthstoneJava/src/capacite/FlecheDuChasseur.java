package capacite;

import jeu.HearthstoneException;
import jeu.Heros;
import jeu.Plateau;

public class FlecheDuChasseur extends Attaque {

	public FlecheDuChasseur() {
		super("Attaque du Heros", "Permet à la carte qui la possède, d'attaquer le héros adverse, en toute circonstance, y compris lorsque le héros est protégé par la provocation.",2);
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
