package capacite;
/**
* Charge: Permet a la cible d'attaquer sans attendre la fin de sa stase
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
import jeu.HearthstoneException;
import carte.*;

public class Charge extends Capacite {

	public Charge() {
		super("Charge", "Permet au serviteur cible d'attaquer pendant son tour de stase");
	}
	
	public void executerEffetDebutTour() throws HearthstoneException {}

	public void executerEffetFinTour() throws HearthstoneException {}

	public void executerAction(Object cible) throws HearthstoneException {}

	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
		((Serviteur)cible).setJouable(true);
	}

	public void executerEffetDisparition(Object cible) throws HearthstoneException {}

}
