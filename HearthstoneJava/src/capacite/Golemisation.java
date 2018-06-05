package capacite;

import carte.*;
import jeu.*;
/**
* Golemisation: Invoque un goleme endomage a la mort de la carte
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
public class Golemisation extends InvocationDeServiteurs {
	
	public Golemisation(IJoueur joueur) throws HearthstoneException{
		super("Golemisation", "Invoque un golem endomage 2/1 a la mort du serviteur", new Serviteur("Golem endomagee", 0, joueur, 2, 1, null), 1);
	}
	
	public void executerEffetDisparition(Object cible) throws HearthstoneException {
			super.executerAction(cible);
	}
	
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
	}
}
