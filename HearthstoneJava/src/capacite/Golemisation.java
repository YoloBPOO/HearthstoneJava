package capacite;

import carte.*;
import jeu.*;

public class Golemisation extends InvocationDeServiteurs {
	
	public Golemisation(IJoueur joueur) throws HearthstoneException{
		super("Golemisation", "Invoque un golem endomage 2/1", new Serviteur("Golem endomagee", 1, joueur, 2, 1, null), 1);
	}
	
		public void executerEffetDisparition(Object cible) throws HearthstoneException {
			super.executerAction(cible);
	}
}
