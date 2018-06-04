package capacite;

import jeu.HearthstoneException;
import jeu.Heros;
import jeu.Plateau;

public class FlecheDuChasseur extends Attaque {

	public FlecheDuChasseur() {
		super("Attaque du Heros", "Permet � la carte qui la poss�de, d'attaquer le h�ros adverse, en toute circonstance, y compris lorsque le h�ros est prot�g� par la provocation.",2);
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
