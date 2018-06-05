package capacite;
/**
* Rale d'agonie : inflige deux point de degat au hero adverse a la mort du serviteur
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
import jeu.*;

public class Lepre extends Attaque {
	public Lepre() {
		super("Rale d'agonie", "Inflige 2 points de degat au heros adverse", 2);
	}
	
	public void executerEffetDebutTour() throws HearthstoneException {}

	public void executerEffetFinTour() throws HearthstoneException {}

	public void executerAction(Object cible) throws HearthstoneException {
		Heros adv = Plateau.getInstance().getAdversaire(Plateau.getInstance().getJoueurCourant()).getHeros();
		adv.setPdv(adv.getPdv() - this.getDegat());
	}

	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {}

	public void executerEffetDisparition(Object cible) throws HearthstoneException {
		this.executerAction(cible);
	}
}
