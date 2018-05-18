package capacite;

import jeu.HearthstoneException;

/**
 * AttaqueCiblee est une capacit� qui permet � un sort ou � un serviteur d'infliger des d�g�ts � une cible
 * @author BIVER - ROUSSEL
 * @version 0.1.0
 * @see Capacite
 */

public class AttaqueCiblee extends Capacite {

	public AttaqueCiblee() {
		super("Attaque ciblee", "Permet � la carte qui la poss�de d'attaquer une cible, soit le h�ros, soit l'un de ses serviteurs. Cette capacit� est sensible � la provocation.");
	}
	
	@Override
	public void executerEffetDebutTour() throws HearthstoneException {}

	@Override
	public void executerEffetFinTour() throws HearthstoneException {}

	@Override
	public void executerAction(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {}

	@Override
	public void executerEffetDisparition(Object cible) throws HearthstoneException {}
}
