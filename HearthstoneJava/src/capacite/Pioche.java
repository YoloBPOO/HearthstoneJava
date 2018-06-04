package capacite;

import jeu.HearthstoneException;
import carte.ICarte;

public class Pioche extends Capacite {
	
	private int nbr;

	public Pioche(int nb) {
		super("Pioche", "Pioche "+nb+" carte");
		setNbr(nb);
	}
	
	public void setNbr(int n) {
		this.nbr=n;
	}
	
	public int getNbr() {
		return this.nbr;
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {
		for(int i = 0; i < this.nbr; i++) {
			((ICarte) cible).getProprietaire().piocher();
		}
	}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		this.executerAction(cible);
	}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}

}
