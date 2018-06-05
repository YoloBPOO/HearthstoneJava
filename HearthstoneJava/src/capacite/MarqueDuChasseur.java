package capacite;
/**
* MarqueDuChasseur: les point de vie du serviteur cible passent a 1 
* @author ROUSSEL - BIVER
* @version 0.9.0
* @see capacite
*/
import jeu.HearthstoneException;
import carte.*;

public class MarqueDuChasseur extends Attaque {

		public MarqueDuChasseur() {
			super("Marque du Chasseur", "Modifie les points de vie du serviteur cible a 1", 0);
		}
		
		@Override
		public void executerEffetDebutTour() throws HearthstoneException {}

		@Override
		public void executerEffetFinTour() throws HearthstoneException {}

		@Override
		public void executerAction(Object cible) throws HearthstoneException {
			if(cible instanceof Serviteur)
				((Serviteur) cible).setPdv(1);
			else
				throw new HearthstoneException("La cible n'est pas un serviteur");
		}
	
		@Override
		public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
			this.executerAction(cible);
		}

		@Override
		public void executerEffetDisparition(Object cible) throws HearthstoneException {}
	}

